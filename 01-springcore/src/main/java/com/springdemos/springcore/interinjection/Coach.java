package com.springdemos.springcore.interinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coach {
	@Value("1003")
	private int id;
	@Value("maxi")
	private String name;
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", sport=" + sport.play() + "]";
	}

	@Autowired
	private Sport sport;

	

	
}
