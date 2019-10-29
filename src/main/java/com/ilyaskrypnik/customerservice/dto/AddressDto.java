package com.ilyaskrypnik.customerservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
    private String country;

    private String region;

    private String city;

    private String street;

    private String house;

    private String flat;
}
