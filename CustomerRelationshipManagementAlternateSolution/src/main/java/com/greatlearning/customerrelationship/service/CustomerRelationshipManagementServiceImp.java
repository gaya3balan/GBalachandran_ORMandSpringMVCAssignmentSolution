package com.greatlearning.customerrelationship.service;
import com.greatlearning.customerrelationship.entity.Customer;
import com.greatlearning.customerrelationship.repo.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CustomerRelationshipManagementServiceImp implements CustomerRelationshipManagementService {
	
	@Autowired
	CustomerRepo repository;

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return repository.viewAll();
	}

	

	@Override
	public void insert(Customer customer) {
		repository.save(customer);
	}
	
	@Override
	public void update(Customer customer) {
		repository.save(customer);

	}

	@Override
	public void deleteById(int id) {
		repository.delete(id);

	}


	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
