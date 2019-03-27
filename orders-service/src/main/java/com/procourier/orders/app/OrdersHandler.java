package com.procourier.orders.app;

import com.procourier.model.Order;
import com.procourier.model.repository.OrderRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.Objects;
import java.util.Optional;

public final class OrdersHandler implements Route {
    public final OrderRepository repository;

    public OrdersHandler(OrderRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    //private OrdersHandler() {}

   // public static final OrdersHandler INSTANCE = new OrdersHandler();

    @Override
    public Object handle(Request request, Response response) throws Exception {
        final String id = request.params(":id");
        final Long longId = Long.valueOf(id);

        final Optional<Order> order = repository.findById(longId);
        final String info = order.map(o -> o.getId() + " " + o.getBuyer().getName()).orElse("not found");
        return info;
    }
}
