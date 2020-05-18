package com.rakesh.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoDriverApp {

	public static void main(String[] args) {
		
	//read Spring configuration-from java configuration
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.register(SportsConfiguration.class);
	context.refresh();
	//get bean from container
	Coach theCoach=context.getBean("tennisCoach",Coach.class);
	
	
	
	//call a method on the bean
	System.out.println(theCoach.getDailyWorkout());
	
	//call method get daily fortune
	System.out.println(theCoach.getDailyFortune());
	
	//close the context
	context.close();
	}

}
