package com.balun.springboot.masterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired //using this is optional but good to use as it documents behavior
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomer(){
        return customerRepository.getCustomers();
    }
}
