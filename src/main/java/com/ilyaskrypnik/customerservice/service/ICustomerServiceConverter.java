package com.ilyaskrypnik.customerservice.service;

public interface ICustomerServiceConverter<T,U> {
    T getFromDto(U arg);
}
