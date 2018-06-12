package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketSetterApp {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Cricketcoach coach=context.getBean("myCricket",Cricketcoach.class);
	System.out.println(coach.getDailyWorkout());
	System.out.println(coach.getDailyFortune());
	System.out.println(coach.getEmail());
	System.out.println(coach.getTeam());
	}

}
