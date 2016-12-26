	package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="shippingdetails")
@Component
public class Shippingdetails {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int shippingdetailsid;
	 private String username;
	 private String productname;
	 private String emailid;
	 private int phonenumber;
	 private int price;
	 private String address;
	 private int zipcode;
	public int getShippingdetailsid() {
		return shippingdetailsid;
	}
	public void setShippingdetailsid(int shippingdetailsid) {
		this.shippingdetailsid = shippingdetailsid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	 
	 
}
