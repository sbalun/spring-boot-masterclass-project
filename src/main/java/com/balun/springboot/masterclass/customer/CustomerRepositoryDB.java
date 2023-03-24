package com.balun.springboot.masterclass.customer;
import java.util.Collections;
import java.util.List;

public class CustomerRepositoryDB implements CustomerRepository {
    @Override
    public List<Customer> getCustomers(){
        //TODO connect to live db
        return Collections.singletonList(
                new Customer(1L, "TODO.  Implement real DB", "blahblah", "email@balun.com")
        );
    }
}
