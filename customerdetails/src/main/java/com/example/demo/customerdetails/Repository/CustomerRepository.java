package com.example.demo.customerdetails.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.customerdetails.Model.Customer;

@Repository
public interface CustomerRepository {
	Customer getById(Long id);

	List<Customer> getAll();

}
