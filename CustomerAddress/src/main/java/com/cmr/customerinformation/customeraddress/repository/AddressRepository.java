package com.cmr.customerinformation.customeraddress.repository;

import java.util.List;

import com.cmr.customerinformation.customeraddress.addressmodel.Address;

public interface AddressRepository {
	
	Address getById(Long id);

	List<Address> getAll();
	
	public Address deleteAddress(Long id);
	
	public Address updateAddress(Long id, Address addresss);
	
	public Address addAddress(Address addresss);
}
