package com.balun.springboot.masterclass.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useMockCustomerRepo:false}")
    private Boolean useMockCustomerRepo;

            // The @Bean annotation allows us to instantiate a class where we some extra
    @Bean   // can have configuration and set-up steps before the class is initialized
    CommandLineRunner commandLineRunner () {
        // Use this spring specific class when we want to do some setup when the application starts
        return args -> {
            System.out.println("Veni, vidi, vici");
        };
    }
    @Bean
    CustomerRepository customerRepository(){
        System.out.println("useMockCustomerRepo = " + useMockCustomerRepo);
        return useMockCustomerRepo ? new CustomerRepositoryMock() : new CustomerRepositoryDB();
    }
}
