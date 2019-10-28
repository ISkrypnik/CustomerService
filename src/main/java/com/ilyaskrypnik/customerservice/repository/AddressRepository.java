package com.ilyaskrypnik.customerservice.repository;

import com.ilyaskrypnik.customerservice.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
