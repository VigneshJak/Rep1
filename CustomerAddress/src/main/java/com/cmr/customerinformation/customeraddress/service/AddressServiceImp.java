/**
 * 
 */
package com.cmr.customerinformation.customeraddress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmr.customerinformation.customeraddress.addressmodel.Address;
import com.cmr.customerinformation.customeraddress.repository.AddressRepository;

/**
 * @author User
 *
 */
@Service
public class AddressServiceImp implements AddressService {
	@Autowired
	AddressRepository addressRepository;

	public Address getById(Long id) {
		// TODO Auto-generated method stub
		return addressRepository.getById(id);
	}

	public List<Address> getAll() {
		// TODO Auto-generated method stub
		return addressRepository.getAll();
	}

	public Address deleteAddress(Long id) {
		// TODO Auto-generated method stub
		return addressRepository.deleteAddress(id);
	}

	public Address updateAddress(Long id, Address address) {
		// TODO Auto-generated method stub
		return addressRepository.updateAddress(id, address);
	}

	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		return addressRepository.addAddress(address);
	}

}
