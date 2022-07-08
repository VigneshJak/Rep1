package com.example.demo2.CustomerAddress.Service;

import java.util.List;

import com.example.demo2.CustomerAddress.AddressModel.Address;

public interface AddressService {

	Address getById(Long id);

	List<Address> getAll();

	Address deleteAddress(Long id);

	Address updateAddress(Long id, Address address);

	Address addAddress(Address address);

}
