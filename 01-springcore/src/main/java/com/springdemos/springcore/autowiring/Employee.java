package com.springdemos.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int Id;
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", age=" + age + ", adress=" + adress + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adress getAdress() {
		return adress;
	}
  

	private Adress adress;
	@Autowired
	public void setAddress(Adress adress) {
		this.adress = adress;
	}
}
