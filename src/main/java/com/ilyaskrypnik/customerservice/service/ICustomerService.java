package com.ilyaskrypnik.customerservice.service;

import com.ilyaskrypnik.customerservice.domain.Customer;

import java.util.List;

public interface ICustomerService {

    Customer create(Customer customer);

    List<Customer> findAllByFirstNameAndLastName(String firstName, String lastName);

    Customer getById(long id);

    Customer save(Customer customer);
}
