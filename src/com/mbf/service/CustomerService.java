package com.mbf.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mbf.model.Customer;
import com.mbf.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Transactional
	public List getAllCustomer() {
		List customers = new ArrayList();
		List customerIterable = (List) customerRepository.findAll();
//		Iterator customerIterator = customerIterable.iterator();
//		while (customerIterator.hasNext()) {
//			customers.add(customerIterator.next());
//		}
		return customerIterable;
	}

	@Transactional
	public Customer getCustomer(int id) {
		return customerRepository.findOne(id);
	}

	@Transactional
	public void addCustomer(Customer customer) {
		System.out.println("customer name before Model"+customer);
		customerRepository.save(customer);
	}

	@Transactional
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Transactional
	public void deleteCustomer(int id) {
		customerRepository.delete(id);
	}
}
