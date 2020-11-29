package com.promtech.inventManageApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.promtech.inventManageApi.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
