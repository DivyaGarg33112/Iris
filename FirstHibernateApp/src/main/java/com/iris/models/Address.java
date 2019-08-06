package com.iris.models;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	
	private String houseNo;
	private String locality;
	private String city;
	private String state;
	
	public Address(){}
	
	
	public Address(String houseNo, String locality, String city, String state) {
		this.houseNo = houseNo;
		this.locality = locality;
		this.city = city;
		this.state = state;
	}



	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality
				+ ", city=" + city + ", state=" + state + "]";
	}
	
	
}
