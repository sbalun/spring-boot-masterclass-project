package com.balun.springboot.masterclass.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Java Abstract reminder...
// The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes).


// Java Interface reminder...
// - You cannot create objects of interfaces.
// - To use an interface but some other classes must implement it.

@Repository
public interface CustomerRepository
        extends JpaRepository<Customer, Long> {
}