package com.ilyaskrypnik.customerservice.controller;

import com.ilyaskrypnik.customerservice.domain.Customer;
import com.ilyaskrypnik.customerservice.dto.CustomerDto;
import com.ilyaskrypnik.customerservice.service.ICustomerConverter;
import com.ilyaskrypnik.customerservice.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerServiceController {

    private final ICustomerConverter customerConverter;
    private final ICustomerService customerService;

    CustomerServiceController(ICustomerConverter customerConverter, ICustomerService customerService) {
        this.customerConverter = customerConverter;
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomer(@RequestParam String firstName, @RequestParam String lastName) {
        return customerService.findAllByFirstNameAndLastName(firstName, lastName);
    }

    @PostMapping
    public List<Customer> create(@Valid @RequestBody CustomerDto customerDto) {
        return customerService.create(customerConverter.getFromDto(customerDto));
    }
}
