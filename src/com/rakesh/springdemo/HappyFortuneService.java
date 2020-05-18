package com.rakesh.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return ">>JavaConfig>>Tennis Coach:: Hi!! Today is your Lucky Day ";
	}

}
