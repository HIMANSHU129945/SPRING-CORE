package com.jsp;

public class Address {
	
	private String states;
	private String city;
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [states=" + states + ", city=" + city + "]";
	}

}
