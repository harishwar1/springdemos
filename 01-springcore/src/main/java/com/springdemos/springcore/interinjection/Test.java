package com.springdemos.springcore.interinjection;

import java.security.DomainCombiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/interinjection/config.xml");
		Coach list = (Coach) context.getBean("coach");
		System.out.println(list);
	}
}
