package com.bitcamp.web.repositories;

import com.bitcamp.web.entities.Customer;

import org.springframework.data.repository.CrudRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends CrudRepository<Customer,Long>{//DTO는 데이터값이고 Customer이 설정값이라서 이걸 담아와야함 헷갈 x
    
    
}