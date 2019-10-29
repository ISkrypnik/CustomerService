package com.ilyaskrypnik.customerservice.controller;

import com.ilyaskrypnik.customerservice.domain.Customer;
import com.ilyaskrypnik.customerservice.dto.AddressDto;
import com.ilyaskrypnik.customerservice.dto.CustomerDto;
import com.ilyaskrypnik.customerservice.service.AddressConverter;
import com.ilyaskrypnik.customerservice.service.CustomerConverter;
import com.ilyaskrypnik.customerservice.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerServiceController {

    private final AddressConverter addressConverter;
    private final CustomerConverter customerConverter;
    private final ICustomerService customerService;

    public CustomerServiceController(AddressConverter addressConverter, CustomerConverter customerConverter, ICustomerService customerService) {
        this.addressConverter = addressConverter;
        this.customerConverter = customerConverter;
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomer(@RequestParam String firstName, @RequestParam String lastName) {
        return customerService.findAllByFirstNameAndLastName(firstName, lastName);
    }

    @PostMapping
    public Customer create(@Valid @RequestBody CustomerDto customerDto) {
        return customerService.create(customerConverter.getFromDto(customerDto));
    }

    @PutMapping("{id}/updateActualAddress")
    public Customer updateActualAddress(@PathVariable long id, @RequestBody AddressDto addressDto) {
        Customer customer = customerService.getById(id);
        if (customer != null) {
            customer.setActualAddress(addressConverter.getFromDto(addressDto));
            customerService.save(customer);
        }
        return customer;
    }
}
