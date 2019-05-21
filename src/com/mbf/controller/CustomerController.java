package com.mbf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mbf.model.Customer;
import com.mbf.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET, headers = "Accept=application/json")
	public String showForm(Model model) {
		System.out.println("before customer Form :");
		model.addAttribute("customer", new Customer());
		return "customerForm";
	}
	

	@RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getCountries(Model model) {

		List listofCustomer = customerService.getAllCustomer();
		model.addAttribute("customer", new Customer());
		model.addAttribute("listOfCustomer", listofCustomer);
		return "customerDetails";
	}

	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomer(id);
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {
		/*
		 * System.out.println("customer name before controller"+customer.
		 * getCountryName());
		 */
		if (customer.getId() == 0) {
			customerService.addCustomer(customer);
		} else {
			customerService.updateCustomer(customer);
		}

		return "redirect:/getAllCustomer";
	}

	@RequestMapping(value = "/updateCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCustomer(@PathVariable("id") int id, Model model) {
		model.addAttribute("customer", this.customerService.getCustomer(id));
		return "customerForm";
	}

	@RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/getAllCustomer";

	}
}
