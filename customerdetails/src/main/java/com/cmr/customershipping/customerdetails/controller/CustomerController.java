package com.cmr.customershipping.customerdetails.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cmr.customershipping.customerdetails.model.Customer;
import com.cmr.customershipping.customerdetails.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		
		
		return customerService.getById(id);

	}

	@GetMapping("/customer")
	public List<Customer> getcustomers() {
		return customerService.getAll();

	}
}
