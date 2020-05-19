package com.rakesh.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.rakesh.springdemo")  manually reading beans 
@PropertySource("classpath:sport.properties")
public class SportsConfiguration {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		SwimCoach sc=new SwimCoach(sadFortuneService());
		return sc;
	}
}
