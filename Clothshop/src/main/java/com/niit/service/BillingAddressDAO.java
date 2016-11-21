package com.niit.service;

import java.util.List;

import com.niit.model.BillingAddress;

public interface BillingAddressDAO {
	public List<BillingAddress> getAllBillingAddresss();
	 public BillingAddress getBillingAddress(int billingaddressid);
	 public void insertBillingAddress(BillingAddress billingaddress);
	 public void updateBillingAddress(BillingAddress billingaddress);
	 public void deleteBillingAddress(int id);
	 public void deleteAllBillingAddress(BillingAddress billingaddress);
}
