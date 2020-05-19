package com.rakesh.springdemo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	
	private FortuneService fs;
	
	public SwimCoach(FortuneService fs) {
		System.out.println("JAVA CONFIG>>SwimCoach>>inside Default constructor");
		this.fs=fs;
	}

	@Override
	public String getDailyWorkout() {
		
		return "JAVA CONFIG>>SwimCoach>>Practise back strokes for 25mins";
	}

	@Override
	public String getDailyFortune() {
		
		return fs.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
