package com.demo;

public class Baseballcoach implements Coach{
	private FortuneService fortuneService;
	public Baseballcoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	public String getDailyWorkout() {
		return "Baseball Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
