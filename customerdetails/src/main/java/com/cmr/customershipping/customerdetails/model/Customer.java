package com.cmr.customershipping.customerdetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Customer {

	private Long id;
	private String name;
	private String street;
	private int zip;
	private String state;

	public Customer() {

	}

	public Customer(Long id, String name, String street, int zip, String state, String city) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.zip = zip;
		this.state = state;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", street=" + street + ", zip=" + zip + ", state=" + state
				+ ", city=" + city + "]";
	}

	private String city;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
