package com.mbf.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javassist.bytecode.ByteArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

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
		// Iterator customerIterator = customerIterable.iterator();
		// while (customerIterator.hasNext()) {
		// customers.add(customerIterator.next());
		// }
		return customerIterable;
	}

	/*
	 * public static Customer storeFile(MultipartFile file){ String fileName =
	 * StringUtils.cleanPath(file.getOriginalFilename());
	 * 
	 * try {
	 * 
	 * if(fileName.contains("..")) { throw new
	 * Exception("Sorry! Filename contains invalid path sequence " + fileName);
	 * }
	 * 
	 * Customer dbFile = new Customer();
	 * 
	 * return customerRepository.save(dbFile); } catch (IOException ex) { throw
	 * new Exception("Could not store file " + fileName + ". Please try again!",
	 * ex); }
	 * 
	 * 
	 * }
	 */

	@Transactional
	public Customer getCustomer(int id) {
		return customerRepository.findOne(id);
	}

	@Transactional
	public Customer getCustomerByEmailAddress(String emailAddress) {

		Customer cc = customerRepository.findByEmailAddress(emailAddress);
		/*System.out.println("email is :" + cc.getEmailAddress());*/
		return cc;
	}

	@Transactional
	public void addCustomer(Customer customer) {
		System.out.println("customer name before Model :" + customer);
		Date createdAt = new Date();
		customer.setCreatedAt(createdAt);
		customer.setUpdatedAt(createdAt);
		byte[] profileImage = new byte[2];
		customer.setProfileImage(profileImage);
		System.out.println("profile image :" + profileImage);
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
