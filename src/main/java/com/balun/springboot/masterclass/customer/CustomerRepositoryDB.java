package com.balun.springboot.masterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepositoryDB implements CustomerRepository {
    @Override
    public List<Customer> getCustomers(){
        //TODO connect to live db
        return Collections.singletonList(
                new Customer(1L, "TODO.  Implement real DB", "blahblah")
        );
    }
}
