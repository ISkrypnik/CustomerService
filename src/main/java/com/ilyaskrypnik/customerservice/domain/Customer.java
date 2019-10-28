package com.ilyaskrypnik.customerservice.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "registered_address_id", nullable = false)
    private Address registeredAddress;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "actual_address_id", nullable = false)
    private Address actualAddress;

    @Column(name = "first_name")
    @Size(max = 255)
    private String firstName;
    @Column(name = "last_name")
    @Size(max = 255)
    private String lastName;
    @Column(name = "middle_name")
    @Size(max = 255)
    private String middleName;
    @NotNull
    @Size(max = 6)
    private String sex;
}
