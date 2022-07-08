package com.example.demo.customerdetails.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.example.demo.customerdetails.Model.Customer;

@Repository
public class CustomerRepositoryImp implements CustomerRepository {

	private Map<Long, Customer> customersMap = new HashMap<Long, Customer>();

	CustomerRepositoryImp() {
		// Customer customers1=new Customer(1L,"Andrew");
		// Customer customers2=new Customer(2L,"Bndrew");
		// customersMap.put(1L,customers1);
		// customersMap.put(2L,customers2);
		customersMap.put(1L, new Customer(1L, "Andrew", null, 0, null, null));
		// System.out.println("Item 1 "+customersMap.get(1));
		// customersMap.put(2L,new Customer(2L,"Dndrew", null, 0, null, null));

	}

	public Customer getById(Long id) {

		return customersMap.get(id);
		// return new ArrayList<>(customersMap.values());
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Customer>(customersMap.values());
	}

}
