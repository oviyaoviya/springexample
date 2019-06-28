package com.mbf.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mbf.model.Customer;
import com.mbf.model.Employee;
import com.mbf.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET, headers = "Accept=application/json")
	public String showForm(Model model) {

		model.addAttribute("customer", new Customer());
		return "customerFormThymleaf";
	}

	@RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getCountries(Model model) {

		List<Customer> listofCustomer = customerService.getAllCustomer();
		model.addAttribute("customerOne", listofCustomer.get(0));
		model.addAttribute("listOfCustomer", listofCustomer);
		return "customerDetailsThyeleaf";
	}

	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomer(id);
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCustomer(@ModelAttribute("customer") Customer customer,
			ModelMap modelMap) throws IOException {
		System.out.println("Before controller : " + customer.getFirstName());
		MultipartFile files = customer.getImage();
		MultipartFile files2 = customer.getImage2();// get MultiPart file;

		File fileToSave = new File("/home/user/upload/"
				+ files2.getOriginalFilename());// get MultiPart file and stored
		
		
		// into local disk;
		InputStream fileInputStream = files2.getInputStream();
		Files.copy(fileInputStream, fileToSave.toPath(),
				StandardCopyOption.REPLACE_EXISTING);
       
	String fileUrl = "http://localhost:8080/springexample" + fileToSave.getAbsolutePath();//getting image path from files
	        customer.setProfileImage2(fileUrl);//save path to database
		
		System.out.println("before controller image : "
				+ files2.getOriginalFilename());
		System.out.println("before controller profile image :"
				+ files.getOriginalFilename());

		String email = customer.getEmailAddress();
		Customer customerEmail = customerService
				.getCustomerByEmailAddress(email);
		System.out.println("Email Address in controller :" + customerEmail);

		if (customer.getId() == 0) {
			if (customerEmail == null) {
				customerService.addCustomer(customer);
				System.out.println("comming into If block :");
				return "redirect:/getAllCustomer";
			} else {
				modelMap.put("error", customer.getEmailAddress()
						+ " email is already exist");
				System.out.println("comming into Else block :");
				return "customerFormThymleaf";
			}
		} else {
			customerService.updateCustomer(customer);
			return "redirect:/getAllCustomer";
		}
	}

	@RequestMapping(value = "/updateCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCustomer(@PathVariable("id") int id, Model model) {
		model.addAttribute("customer", this.customerService.getCustomer(id));
		model.addAttribute("listOfCustomer",
				this.customerService.getAllCustomer());
		return "customerFormThymleaf";
	}

	@RequestMapping(value = "/viewCustomerDetails/{id}")
	public String view(@PathVariable int id, Model model,
			HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException {
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("viewOfCustomer", customer);
		System.out.println("customer first name : " + customer.getFirstName());
		byte[] bytes = customer.getProfileImage();
		byte[] encodeBase64 = Base64.encodeBase64(bytes);
		String base64Encoded = new String(encodeBase64, "UTF-8");
		model.addAttribute("imageSource", base64Encoded);
		return "viewCustomerDetails";
	}

	@RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/getAllCustomer";

	}

}
