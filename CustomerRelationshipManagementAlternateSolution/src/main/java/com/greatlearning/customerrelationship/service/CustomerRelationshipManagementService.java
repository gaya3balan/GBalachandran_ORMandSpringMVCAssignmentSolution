package com.greatlearning.customerrelationship.service;

import java.util.List;

import com.greatlearning.customerrelationship.entity.Customer;

public interface CustomerRelationshipManagementService {
	public List<Customer> findAll();
	public Customer findById(int id);
	public void insert(Customer customer);
	public void update(Customer customer);
	public void deleteById(int id);

}
