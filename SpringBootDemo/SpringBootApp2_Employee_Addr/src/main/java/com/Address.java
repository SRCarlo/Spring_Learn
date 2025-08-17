package com;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;
	String state;

	public Address() {
		city = "Mumbai";
		state = "Maharashtra";
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
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
		return "\n\nAddress Details : \ncity:" + city + "\nstate:" + state ;
	}

}
