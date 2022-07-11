package com.cmr.customershipping.customerdetails.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cmr.customershipping.customerdetails.model.Customer;
import com.cmr.customershipping.customerdetails.repository.CustomerRepository;
@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public Customer getById(Long id) {
		
		HashMap<String, Long> uriVariables = new HashMap<String, Long>();
		uriVariables.put("id", id);
		ResponseEntity<Customer> responseEntity = new RestTemplate().getForEntity("http://localhost:8089/customer/{id}",
				Customer.class, uriVariables);
		Customer customer = responseEntity.getBody();
		return new Customer(id, customerRepository.getById(id).getName(), customer.getStreet(), customer.getZip(),
				customer.getCity(), customer.getState());
		//return customerRepository.getById(id);
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerRepository.getAll();
	}


	
	
}
