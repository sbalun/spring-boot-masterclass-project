package com.balun.springboot.masterclass.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}") // you can override this setting in the runner config
    private Boolean useFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Veni, vidi, vici");
        };
    }

    @Bean
    CustomerRepository customerRepository() {
        System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);
        return useFakeCustomerRepo ?
                new CustomerRepositoryMock() :
                new CustomerRepositoryDB();
    }
}