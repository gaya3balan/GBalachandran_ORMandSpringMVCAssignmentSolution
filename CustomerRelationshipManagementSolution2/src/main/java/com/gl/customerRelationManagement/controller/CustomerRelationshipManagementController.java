package com.gl.customerRelationManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.customerRelationManagement.entity.Customer;
import com.gl.customerRelationManagement.service.CustomerRelationshipManagementService;

@Controller
@RequestMapping("/customers")
public class CustomerRelationshipManagementController {

	@Autowired
	private CustomerRelationshipManagementService customerService;

	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		 
		List<Customer> theCustomers = customerService.findAll();

		theModel.addAttribute("Customers", theCustomers);

		return "list-Customers";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Customer theCustomer = new Customer();

		theModel.addAttribute("Customer", theCustomer);

		return "Customer-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {

		 
		Customer theCustomer = customerService.findById(theId);

		theModel.addAttribute("Customer", theCustomer);

		return "Customer-form";
	}

	@PostMapping("/save")
	public String saveCustomer(@RequestParam("id") int id, @RequestParam("first_Name") String firstName,
			@RequestParam("last_Name") String lastName, @RequestParam("email") String email) {

		System.out.println(id);
		System.out.println("firstName" + firstName);
		System.out.println("lastName" + lastName);
		Customer theCustomer;
		if (id != 0) {
			theCustomer = customerService.findById(id);
			theCustomer.setFirstName(firstName);
			theCustomer.setLastName(lastName);
			theCustomer.setEmail(email);
		} else {
			theCustomer = new Customer(firstName, lastName, email);
		}
		 
		customerService.save(theCustomer);

		 
		return "redirect:/customers/list";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("customerId") int theId) {
		 
		customerService.deleteById(theId);

		return "redirect:/customers/list";
	}
}
