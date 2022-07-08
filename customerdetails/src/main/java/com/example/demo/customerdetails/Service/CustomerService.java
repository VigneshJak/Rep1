package com.example.demo.customerdetails.Service;

import java.util.List;

import com.example.demo.customerdetails.Model.Customer;

public interface CustomerService {
	Customer getById(Long id);
	List<Customer> getAll();

	

}
