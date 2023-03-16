package com.balun.springboot.masterclass.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "mock")
public class CustomerRepositoryMock implements CustomerRepository {
    @Override
    public List<Customer> getCustomers(){
        return Arrays.asList(
            new Customer(1L, "Roland Deschain"),
            new Customer(2L, "Eddie Dean"),
            new Customer(3L, "Jake Chambers"),
            new Customer(4L, "Susannah Dean"),
            new Customer(5L, "Oy")

        );
    }
}
