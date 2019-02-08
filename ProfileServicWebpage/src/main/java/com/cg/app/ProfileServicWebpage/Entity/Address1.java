package com.cg.app.ProfileServicWebpage.Entity;

import org.springframework.data.mongodb.core.mapping.Document;


public class Address1 {

	
	private int houseNumber;    
    private String streetName;
    private String city;
    private Integer pinCode;
    private String state;
    private String country;
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address1(int houseNumber, String streetName, String city, Integer pinCode, String state, String country) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
    
}
