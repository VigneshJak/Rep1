package com.example.demo.customerdetails.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.customerdetails.Model.Customer;
import com.example.demo.customerdetails.Service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		HashMap<String, Long> uriVariables = new HashMap<String, Long>();
		uriVariables.put("id", id);
		ResponseEntity<Customer> responseEntity = new RestTemplate().getForEntity("http://localhost:8089/{id}",
				Customer.class, uriVariables);
		Customer customer = responseEntity.getBody();
		return new Customer(id, customerService.getById(id).getName(), customer.getStreet(), customer.getZip(),
				customer.getCity(), customer.getState());

		// return customerService.getById(id);

	}

	@GetMapping("/customer")
	public List<Customer> getcustomers() {
		return customerService.getAll();

	}
}
