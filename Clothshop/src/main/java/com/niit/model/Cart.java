package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cart")
@Component
public class Cart {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int cartid;
	@Column
private String username;
	
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
private int productid;
	@Column
private int quantity;
	@Column
private int price;
	@Column
	private String productname;

	
public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
public int getProductid()
{
 return productid;
}
public void setProductid(int productid)
{
	this.productid=productid;
}
public int getQuantity()
{
 return quantity;
}
public void setQuantity(int quantity)
{
	this.quantity=quantity;
}
public int getPrice()
{
 return price;
}
public void setPrice(int price)
{
	this.price=price;
}
}
