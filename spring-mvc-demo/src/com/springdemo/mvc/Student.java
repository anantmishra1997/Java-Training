package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName,lastName,country;
	private LinkedHashMap<String,String> countryOptions;
	public Student(){
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("IND", "India");
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FRA", "France");
		countryOptions.put("ITA", "Italy");
		countryOptions.put("GER", "Germany");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
