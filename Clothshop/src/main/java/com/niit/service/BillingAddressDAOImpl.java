package com.niit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.BillingAddress;
import com.niit.model.Product;

public class BillingAddressDAOImpl implements BillingAddressDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}
	 
	 public BillingAddressDAOImpl(SessionFactory sessionFactory) {
			super();
			this.sessionFactory = sessionFactory;
		}

		public void setSession(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

	@Transactional
	public List<BillingAddress> getAllBillingAddresss() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from BillingAddress").list();
	}

	@Transactional
	public BillingAddress getBillingAddress(int billingid) {
		// TODO Auto-generated method stub
		return (BillingAddress)sessionFactory.getCurrentSession().get(BillingAddress.class, billingid);
	}

	@Transactional
	public void insertBillingAddress(BillingAddress billingaddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(billingaddress);

	}

	@Transactional
	public void updateBillingAddress(BillingAddress billingaddress) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteBillingAddress(int id) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteAllBillingAddress(BillingAddress billingaddress) {
		// TODO Auto-generated method stub

	}

}
