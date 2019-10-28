package com.ilyaskrypnik.customerservice.service;

import com.ilyaskrypnik.customerservice.domain.Customer;
import com.ilyaskrypnik.customerservice.dto.CustomerDto;
import com.ilyaskrypnik.customerservice.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerConverter implements ICustomerConverter {

    private final AddressRepository addressRepository;

    CustomerConverter(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Customer getFromDto(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setMiddleName(customerDto.getMiddleName());
        customer.setSex(customerDto.getSex());
        customer.setRegisteredAddress(addressRepository.getOne(customerDto.getRegisteredAddressId()));
        customer.setActualAddress(addressRepository.getOne(customerDto.getActualAddressId()));
        return customer;
    }
}
