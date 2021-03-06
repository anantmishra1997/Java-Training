package com.demo;

public class Cricketcoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setEmail(String email) {
		System.out.println("Inside email");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("Inside team");
		this.team = team;
	}

	public Cricketcoach(){
		System.out.println("Inside");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket Coach";
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
