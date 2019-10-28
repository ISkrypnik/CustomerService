package com.ilyaskrypnik.customerservice.repository;

import com.ilyaskrypnik.customerservice.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAllByFirstNameAndLastName(String firstName, String lastName);
}
