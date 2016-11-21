package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.OrderConfirmation;
import com.niit.model.Product;
@Repository("OrderConfirmationDAO")
public class OrderConfirmationDAOImpl implements OrderConfirmationDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}
	 
	 public OrderConfirmationDAOImpl(SessionFactory sessionFactory) {
			super();
			this.sessionFactory = sessionFactory;
		}

		public void setSession(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}


	@Override
	public List<OrderConfirmation> getAllOrderConfirmations() {
		return sessionFactory.getCurrentSession().createQuery("from OrderConfirmation").list();
		
	}

	@Override
	public OrderConfirmation getOrderConfirmation(int orderconfirmationid) {
		// TODO Auto-generated method stub
		return (OrderConfirmation)sessionFactory.getCurrentSession().get(OrderConfirmation.class, orderconfirmationid);
	}

	@Override
	public void insertOrderConfirmation(OrderConfirmation orderconfirmation) {
		sessionFactory.getCurrentSession().saveOrUpdate(orderconfirmation);

	}

	@Override
	public void updateOrderConfirmation(OrderConfirmation orderconfirmation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOrderConfirmation(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllOrderConfirmation(OrderConfirmation orderconfirmation) {
		// TODO Auto-generated method stub

	}

}
