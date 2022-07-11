package com.cmr.customershipping.customerdetails.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cmr.customershipping.customerdetails.model.Customer;

@Repository
public interface CustomerRepository {
	Customer getById(Long id);

	List<Customer> getAll();

}
