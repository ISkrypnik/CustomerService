package com.ilyaskrypnik.customerservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CustomerDto {

    @NotNull
    private AddressDto registeredAddress;

    @NotNull
    private AddressDto actualAddress;

    private String firstName;

    private String lastName;

    private String middleName;

    @NotNull
    private String sex;
}
