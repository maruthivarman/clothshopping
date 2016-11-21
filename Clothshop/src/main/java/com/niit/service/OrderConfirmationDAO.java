package com.niit.service;

import java.util.List;

import com.niit.model.OrderConfirmation;

public interface OrderConfirmationDAO {
	public List<OrderConfirmation> getAllOrderConfirmations();
	 public OrderConfirmation getOrderConfirmation(int orderconfirmationid);
	 public void insertOrderConfirmation(OrderConfirmation orderconfirmation);
	 public void updateOrderConfirmation(OrderConfirmation orderconfirmation);
	 public void deleteOrderConfirmation(int id);
	 public void deleteAllOrderConfirmation(OrderConfirmation orderconfirmation);
}
