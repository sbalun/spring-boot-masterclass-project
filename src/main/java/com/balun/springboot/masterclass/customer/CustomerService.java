package com.balun.springboot.masterclass.customer;

public class CustomerService {
    Customer getCustomer(){
        return new Customer(1L, "Roland Deschain");
    }
}
