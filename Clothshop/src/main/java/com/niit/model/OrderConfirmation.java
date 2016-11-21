package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity 
@Table(name = "OrderConfirmation")
@Component 
public class OrderConfirmation {
	@Column
	private int orderid;
	@Column
	private String userid ;
	@Column
	private int cartid;
	@Column
	private int billingid; 
	@Column
	private int shippingid;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	public int getCartid() {
		return cartid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getBillingid() {
		return billingid;
	}
	public void setBillingid(int billingid) {
		this.billingid = billingid;
	}
	public int getShippingid() {
		return shippingid;
	}
	public void setShippingid(int shippingid) {
		this.shippingid = shippingid;
	}
	
}
