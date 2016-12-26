package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Shippingdetails;
@Repository("ShippingdetailsDAO")
public class ShippingdetailsDAOImpl implements ShippingdetailsDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}

	public ShippingdetailsDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void setSession(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Shippingdetails> getAllShippingdetailss()
	 {
		
			return sessionFactory.getCurrentSession().createQuery("from Shippingdetails").list();	
	}
	@Transactional
	public Shippingdetails getShippingdetails(int userId) {
		return (Shippingdetails)sessionFactory.getCurrentSession().get(Shippingdetails.class, userId);
	}
	@Transactional
	public void insertShippingdetails(Shippingdetails shippingdetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingdetails);
	}
	@Transactional
	public void updateShippingdetails(Shippingdetails shippingdetails) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void deleteShippingdetails(int id) {
		Shippingdetails deleteShippingdetails = new Shippingdetails();
		deleteShippingdetails.setProductname("productname");
		sessionFactory.getCurrentSession().delete(deleteShippingdetails);
		
	}
	@Transactional
	public void deleteAllShippingdetails(Shippingdetails shippingdetails) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Shippingdetails> getAllShipppingdetailss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Shippingdetails getShipppingdetails(int shippingdetailsid) {
		// TODO Auto-generated method stub
		return null;
	}


}
