package com.greatlearning.customerrelationship.repo;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.customerrelationship.entity.Customer;

@Repository
@Transactional

public class CustomerRepoImpl implements CustomerRepo{
	
	@Autowired
	private SessionFactory sessionFactory;

	// create session
	private Session session;

	@Autowired
	CustomerRepoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}

	}
	
	@Override
	public List<Customer> viewAll() {
	
		Transaction tx = session.beginTransaction();

		// find all the records from the database table
		List<Customer> customers = session.createQuery("from Customer").list();
		tx.commit();
		return customers;
		// TODO Auto-generated method stub
	
	}

	@Override
	public void save(Customer book) {
		
		Transaction tx = session.beginTransaction();
		// TODO Auto-generated method stub
		session.saveOrUpdate(book);
		tx.commit();
	}

	
	@Override
	public Customer findById(int id) {

		Customer customer = new Customer();

		
		Transaction tx = session.beginTransaction();

		// find record with Id from the database table
		customer = session.get(Customer.class, id);

		tx.commit();

		return customer;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Transaction tx = session.beginTransaction();

		// get transaction
		Customer customer = session.get(Customer.class, id);

		// delete record
		session.delete(customer);

		tx.commit();
		
	}

	
}
