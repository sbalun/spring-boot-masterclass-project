package com.balun.springboot.masterclass.customer;

public class Customer {
    private final Long id;
    private final String name;

    Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
