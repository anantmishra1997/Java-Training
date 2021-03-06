package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomService")
	private FortuneService theFortune;
	
//	@Autowired
//	public void hello(FortuneService theService) {
//		// TODO Auto-generated constructor stub
//		theFortune=theService;
//		System.out.println("inside hello");
//	}
	@Override
	public String getDailyWorkout() {
		return "Tennis Coach";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return theFortune.getFortune();
	}

}
