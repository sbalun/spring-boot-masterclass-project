package com.balun.springboot.masterclass.customer;
import java.util.Arrays;
import java.util.List;

public class CustomerRepositoryMock implements CustomerRepo {
    @Override
    public List<Customer> getCustomers(){
        return Arrays.asList(
            new Customer(1L, "James Bond", "password123", "email@gmail.com"),
            new Customer(2L, "Jamilla Ahmed", "123password", "email@balun.com")
        );
    }
}
