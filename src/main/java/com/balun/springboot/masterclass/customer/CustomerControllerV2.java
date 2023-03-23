package com.balun.springboot.masterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequestMapping("api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer>getCustomer(){
        return Collections.singletonList(new Customer(0L,"Vinny Two","blahblahblah"));
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
