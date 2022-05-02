package com.springdemos.springcore.interinjection;

import org.springframework.stereotype.Component;

@Component
public class BasketBall implements Sport {

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "playing";
	}

}
