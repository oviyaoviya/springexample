package com.mbf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mbf.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	public Customer findByEmailAddress(String emailAddress);
	
}
