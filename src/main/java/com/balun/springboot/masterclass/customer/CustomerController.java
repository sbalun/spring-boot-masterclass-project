package com.balun.springboot.masterclass.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(){
        customerService = new CustomerService();
    }

    @GetMapping("/")
    Customer getCustomer(){
        return customerService.getCustomer();
    }
}
