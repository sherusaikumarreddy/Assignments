package com.webapps.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

	Coach thecoach =(Coach) context.getBean("tennisCoach");
	
	System.out.println(thecoach.getDailyworkout());
	
	System.out.println(thecoach.getFortune());
	
	context.close();
	}

}
