package com.gl.customerRelationManagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.customerRelationManagement.entity.Customer;

@Repository
public class CustomerRelationshipManagementServiceImpl implements CustomerRelationshipManagementService {

	private SessionFactory sessionFactory;

	
	private Session session;

	@Autowired
	CustomerRelationshipManagementServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}

	}

	@Transactional
	public List<Customer> findAll() {
		Transaction tx = session.beginTransaction();

		List<Customer> customers = session.createQuery("from Customer").list();

		tx.commit();

		return customers;
	}

	@Transactional
	public void save(Customer theCustomer) {
		// TODO Auto-generated method stub
		
		Transaction tx = session.beginTransaction(); 
		
		session.saveOrUpdate(theCustomer);

		tx.commit();
	}

	@Transactional
	public void deleteById(int theId) {

		Transaction tx = session.beginTransaction();
		
		Customer customerRec = session.get(Customer.class, theId);
		
		session.delete(customerRec);
		
		tx.commit();
	}
	
	@Transactional
	public Customer findById(int theId) {

		Customer customerRecord = new Customer();

		Transaction tx = session.beginTransaction();

		customerRecord = session.get(Customer.class, theId);

		tx.commit();

		return customerRecord;
	}


	@Transactional
	public void print(List<Customer> customer) {

		for (Customer cust : customer) {
			System.out.println(cust);
		}

	}

}