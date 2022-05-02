package com.springdemos.springcore.standalone.collections;

import java.security.DomainCombiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/standalone/collections/config.xml");
		ProductsList list = (ProductsList) context.getBean("products");
		System.out.println(list);
	}
}
