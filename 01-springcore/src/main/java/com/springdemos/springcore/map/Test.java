package com.springdemos.springcore.map;

import java.security.DomainCombiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/map/config.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
		System.out.println(customer.getProducts().getClass());
	}
}
