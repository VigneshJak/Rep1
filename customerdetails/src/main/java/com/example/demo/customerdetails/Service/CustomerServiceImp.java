package com.example.demo.customerdetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customerdetails.Model.Customer;
import com.example.demo.customerdetails.Repository.CustomerRepository;
@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public Customer getById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.getById(id);
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerRepository.getAll();
	}


	
	
}
