package com.rakesh.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoDriverAppProperties {

	public static void main(String[] args) {
		
	//read Spring configuration-from java configuration
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.register(SportsConfiguration.class);
	context.refresh();
	//get bean from container
	//to call the getter methods
	SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
	
	
	
	//call a method on the bean
	System.out.println(theCoach.getDailyWorkout());
	
	//call method get daily fortune
	System.out.println(theCoach.getDailyFortune());
	
	System.out.println(theCoach.getEmail());
	System.out.println(theCoach.getTeam());
	
	
	//close the context
	context.close();
	}

}
