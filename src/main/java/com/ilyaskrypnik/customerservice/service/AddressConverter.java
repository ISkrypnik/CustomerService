package com.ilyaskrypnik.customerservice.service;

import com.ilyaskrypnik.customerservice.domain.Address;
import com.ilyaskrypnik.customerservice.dto.AddressDto;
import org.springframework.stereotype.Service;

@Service
public class AddressConverter implements ICustomerServiceConverter<Address, AddressDto> {

    @Override
    public Address getFromDto(AddressDto addressDto) {
        Address address = new Address();
        address.setCity(addressDto.getCity());
        address.setCountry(addressDto.getCountry());
        address.setFlat(addressDto.getFlat());
        address.setHouse(addressDto.getHouse());
        address.setRegion(addressDto.getRegion());
        address.setStreet(addressDto.getStreet());

        return address;
    }
}
