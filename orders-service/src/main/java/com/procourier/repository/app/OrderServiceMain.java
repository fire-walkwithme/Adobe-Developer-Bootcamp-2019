package com.procourier.repository.app;
import spark.Spark;

public class OrderServiceMain {
    public static void main(String[] args) {
        Spark.port(8082);
        Spark.get("/orders/hello", OrdersHandler.INSTANCE);
    }
}
