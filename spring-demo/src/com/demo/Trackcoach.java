package com.demo;

public class Trackcoach implements Coach {

	private FortuneService fortuneService;
	public Trackcoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void init() {
		System.out.println("Startup");
	}
	
	public void destroyed() {
		System.out.println("Destroyed");
	}

}
