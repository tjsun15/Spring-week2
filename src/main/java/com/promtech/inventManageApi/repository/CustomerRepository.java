package com.promtech.inventManageApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.promtech.inventManageApi.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}


