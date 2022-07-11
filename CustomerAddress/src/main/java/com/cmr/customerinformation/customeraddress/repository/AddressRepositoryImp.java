package com.cmr.customerinformation.customeraddress.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cmr.customerinformation.customeraddress.addressmodel.Address;

@Repository
public class AddressRepositoryImp implements AddressRepository {

	private Map<Long, Address> address = new HashMap<Long, Address>();
	private Long index=2L;
	AddressRepositoryImp() {

		address.put(1L, new Address(1l, "3528 Gentian Blvd", 600001, "GA", "City", 9087654321L, "Male", "abc@gmail.com",
				"11-11-1996"));
		address.put(2L, new Address(2l, "3628 Gentian Blvd", 600002, "MA", "City2", 9087654321L, "Male",
				"abc@gmail.com", "11-11-1996"));

	}

	public Address getById(Long id) {
		// TODO Auto-generated method stub
		return address.get(id);
	}

	public List<Address> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Address>(address.values());

	}

	public Address deleteAddress(Long id) {
		return address.remove(id);
	}

	public Address updateAddress(Long id, Address addresss) {
		addresss.setId(id);
		address.put(id, addresss);
		return addresss;

	}
	
	public Address addAddress(Address addresss){
		index=index+1;
		addresss.setId(index);
		address.put(index, addresss);
		return addresss;
		
	}
}
