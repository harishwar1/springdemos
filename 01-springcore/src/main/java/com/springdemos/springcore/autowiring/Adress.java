package com.springdemos.springcore.autowiring;

public class Adress {
private String houseno;
private String street;
private String city;

@Override
public String toString() {
	return "Adress [houseno=" + houseno + ", street=" + street + ", city=" + city + "]";
}

public String getHouseno() {
	return houseno;
}

public void setHouseno(String houseno) {
	this.houseno = houseno;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
}
