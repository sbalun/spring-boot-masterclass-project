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
            new Customer(1L, "Roland Deschain", "abc123"),
            new Customer(2L, "Eddie Dean", "def123"),
            new Customer(3L, "Jake Chambers", "hij123"),
            new Customer(4L, "Susannah Dean", "lmn123"),
            new Customer(5L, "Oy", "opq123")

        );
    }
}
