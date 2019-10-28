package com.ilyaskrypnik.customerservice.service;

import com.ilyaskrypnik.customerservice.domain.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> create(Customer customer);

    List<Customer> findAllByFirstNameAndLastName(String firstName, String lastName);
}
