package com.balun.springboot.masterclass.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    Customer getCustomer(){
        return new Customer(1L, "Roland Deschain");
    }
}
