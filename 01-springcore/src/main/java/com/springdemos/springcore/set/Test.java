package com.springdemos.springcore.set;

import java.security.DomainCombiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/set/config.xml");
		CarDealer car = (CarDealer) context.getBean("car");
		System.out.println(car);
	}
}
