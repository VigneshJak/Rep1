package com.example.demo2.CustomerAddress.Repository;

import java.util.List;

import com.example.demo2.CustomerAddress.AddressModel.Address;

public interface AddressRepository {
	
	Address getById(Long id);

	List<Address> getAll();
	
	public Address deleteAddress(Long id);
	
	public Address updateAddress(Long id, Address addresss);
	
	public Address addAddress(Address addresss);
}
