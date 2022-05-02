package com.springdemos.springcore.autowiring;

import java.security.DomainCombiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/autowiring/config.xml");
		Employee details = (Employee) context.getBean("employee");
		System.out.println(details);
	}
}
