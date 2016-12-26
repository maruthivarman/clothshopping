package com.niit.service;

import java.io.IOException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Cart;
@Repository
public class CartDAOImpl implements CartDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}

	public CartDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void setSession(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Cart> getAllCarts()
	 {
		
			return sessionFactory.getCurrentSession().createQuery("from Cart").list();	
	}
	@Transactional
	public List<Cart> getCart(String username) {
		return sessionFactory.getCurrentSession().createQuery("from Cart where username='"+username+"'").list();
	}
	@Transactional
	public void insertCart(Cart cart) {
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}
	@Transactional
	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void deleteCart(int id) {
		Cart deleteCart = new Cart();
		deleteCart.setCartid(id);
		sessionFactory.getCurrentSession().delete(deleteCart);
		
	}
	@Transactional
	public void deleteAllCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public Cart validate(Cart cart) throws IOException{
		return cart;
		
	}

}
