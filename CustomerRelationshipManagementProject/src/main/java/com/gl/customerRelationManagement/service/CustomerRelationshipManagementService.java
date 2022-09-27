package com.gl.customerRelationManagement.service;

import java.util.List;

import com.gl.customerRelationManagement.entity.Customer;

public interface CustomerRelationshipManagementService {
	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer theCustomer);

	public void deleteById(int theId);
}