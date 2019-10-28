package com.ilyaskrypnik.customerservice.service;

import com.ilyaskrypnik.customerservice.domain.Customer;
import com.ilyaskrypnik.customerservice.dto.CustomerDto;

public interface ICustomerConverter {

    Customer getFromDto(CustomerDto customerDto);
}
