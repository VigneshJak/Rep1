package com.example.demo2.CustomerAddress.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.CustomerAddress.AddressModel.Address;
import com.example.demo2.CustomerAddress.Service.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;

	@GetMapping("/customer/{id}")
	public Address findaddressbyId(@PathVariable Long id) {
		return addressService.getById(id);

	}

	@GetMapping("/customer")
	public List<Address> getadress() {
		return addressService.getAll();

	}

	@DeleteMapping("/customer/deletecustomer/{id}")
	public Address deleteCustomer(@PathVariable Long id) {
		return addressService.deleteAddress(id);

	}
	
	@PutMapping("/customer/updatecustomer/{id}")
	public Address updateCustomer(@PathVariable Long id, @RequestBody Address address) {
		return addressService.updateAddress(id,address);

	}
	
	@PostMapping("/customer/addcustomer")
	public Address addCustomer(@RequestBody Address address) {
		return addressService.addAddress(address);

	}
}
