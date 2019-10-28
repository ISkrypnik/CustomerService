package com.ilyaskrypnik.customerservice.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "address")
@Data
public class Address {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Size(max = 255)
    private String country;
    @Size(max = 255)
    private String region;
    @Size(max = 255)
    private String city;
    @Size(max = 255)
    private String street;
    @Size(max = 255)
    private String house;
    @Size(max = 255)
    private String flat;
    private LocalDateTime created;
    private LocalDateTime modified;
}
