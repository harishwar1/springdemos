package com.springdemos.springcore.list;

import java.security.DomainCombiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/list/config.xml");
		Hospital hos = (Hospital) context.getBean("hos");
		System.out.println(hos);
	}
}
