package com.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
	private String[] data= {"Kanha","Mishra","Anant"};
	private Random myRandom=new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index]; 
		return theFortune;
	}

}
