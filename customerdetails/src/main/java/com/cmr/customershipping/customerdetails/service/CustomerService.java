package com.cmr.customershipping.customerdetails.service;

import java.util.List;

import com.cmr.customershipping.customerdetails.model.Customer;

public interface CustomerService {
	Customer getById(Long id);
	List<Customer> getAll();
	
	

}
