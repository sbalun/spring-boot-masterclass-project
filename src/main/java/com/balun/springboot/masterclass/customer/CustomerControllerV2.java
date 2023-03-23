package com.balun.springboot.masterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RequestMapping("api/v2/customers")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer>getCustomers(){
        return customerService.getCustomers();
    }
    @GetMapping(path="{customerId}")
    Customer getCustomer(@PathVariable("customerId")Long id){
        return customerService.getCustomer(id);
    }
    @PostMapping("/")
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST Request: " + customer);
    }

    @PutMapping("/")
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT Request: " + customer);
    }

    @DeleteMapping(path="{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE Request for id: " + id);
    }
}

