package com.promtech.inventManageApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.promtech.inventManageApi.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}


