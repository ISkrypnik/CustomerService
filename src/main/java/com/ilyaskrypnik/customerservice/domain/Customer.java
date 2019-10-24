package com.ilyaskrypnik.customerservice.domain;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    private Long id;
    @NonNull
    private Long registeredAddressId;
    @NonNull
    private Long actualAddressId;
    private String firstName;
    private String lastName;
    private String middleName;
    @NonNull
    private String sex;
}
