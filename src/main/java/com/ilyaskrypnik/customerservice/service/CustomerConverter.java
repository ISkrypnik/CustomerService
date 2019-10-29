package com.ilyaskrypnik.customerservice.service;

import com.ilyaskrypnik.customerservice.domain.Customer;
import com.ilyaskrypnik.customerservice.dto.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerConverter implements ICustomerServiceConverter<Customer, CustomerDto> {

    private final AddressConverter addressConverter;

    CustomerConverter(AddressConverter addressConverter) {
        this.addressConverter = addressConverter;
    }

    @Override
    public Customer getFromDto(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setMiddleName(customerDto.getMiddleName());
        customer.setSex(customerDto.getSex());
        customer.setRegisteredAddress(addressConverter.getFromDto(customerDto.getRegisteredAddress()));
        customer.setActualAddress(addressConverter.getFromDto(customerDto.getActualAddress()));
        return customer;
    }
}
