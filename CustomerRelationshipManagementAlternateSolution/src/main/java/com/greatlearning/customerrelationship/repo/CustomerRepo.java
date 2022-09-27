package com.greatlearning.customerrelationship.repo;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.greatlearning.customerrelationship.entity.*;


@Repository
public interface CustomerRepo {
	
	List<Customer> viewAll();
	void save(Customer book);
	Customer findById(int theId);
	void delete(int book_id);
	
}
