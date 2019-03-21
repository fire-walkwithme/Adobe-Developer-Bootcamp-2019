package com.procourier.model;

import java.util.Objects;

public class Buyer {
    private String name;
    private String address;

    public Buyer(String name, String address) {
        this.name = Objects.requireNonNull(name);
        this.address = Objects.requireNonNull(address);
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
