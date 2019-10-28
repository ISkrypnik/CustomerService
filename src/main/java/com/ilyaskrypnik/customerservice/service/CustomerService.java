package com.ilyaskrypnik.customerservice.service;

import com.ilyaskrypnik.customerservice.domain.Customer;
import com.ilyaskrypnik.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAllByFirstNameAndLastName(String firstName, String lastName) {
        return customerRepository.findAllByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public List<Customer> create(Customer customer) {
        customerRepository.save(customer);
        return customerRepository.findAll();
    }
}
