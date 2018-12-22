package ru.godsonpeya.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CrickedCoach theCoach = context.getBean("myCrickedCoach", CrickedCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
		context.close();

	}

}