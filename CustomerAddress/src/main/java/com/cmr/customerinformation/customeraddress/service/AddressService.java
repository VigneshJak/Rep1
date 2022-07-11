package com.cmr.customerinformation.customeraddress.service;

import java.util.List;

import com.cmr.customerinformation.customeraddress.addressmodel.Address;

public interface AddressService {

	Address getById(Long id);

	List<Address> getAll();

	Address deleteAddress(Long id);

	Address updateAddress(Long id, Address address);

	Address addAddress(Address address);

}
