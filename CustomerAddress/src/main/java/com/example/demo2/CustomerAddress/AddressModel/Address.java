package com.example.demo2.CustomerAddress.AddressModel;


public class Address {
	private Long id;
	private String street;
	private int zip;
	private String state;
	private String city;
	private Long phone;
	private String Gender;
	private String email;
	private String dob;
	public Address(){
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", zip=" + zip + ", state=" + state + ", city=" + city
				+ ", phone=" + phone + ", Gender=" + Gender + ", email=" + email + ", dob=" + dob + "]";
	}
	public Address(Long id, String street, int zip, String state, String city, Long phone, String gender, String email,
			String dob) {
		super();
		this.id = id;
		this.street = street;
		this.zip = zip;
		this.state = state;
		this.city = city;
		this.phone = phone;
		Gender = gender;
		this.email = email;
		this.dob = dob;
	}
	
}
