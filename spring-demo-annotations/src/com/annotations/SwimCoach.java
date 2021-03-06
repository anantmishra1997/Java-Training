package com.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService thefortune;
	@Value("${kanha.email}")
	private String email;
	@Value("${kanha.team}")
	private String team;
	public SwimCoach(FortuneService fortune) {
	thefortune=fortune;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim Coach";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return thefortune.getFortune();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

}
