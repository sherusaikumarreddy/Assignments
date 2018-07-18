package com.webapps.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
	Coach theCoach=context.getBean("myCoach",Coach.class);
	Coach alphaCoach1=context.getBean("myCoach",Coach.class);
	Coach alphaCoach=context.getBean("myCoach",Coach.class);
	//Coach alphaCoach=(Coach) context.getBean("myCoach");
	boolean result = (theCoach==alphaCoach1);
	
	System.out.println("pointing to the same location:  "+result);
	
	System.out.println("memory location for theCoach:  "+theCoach);
	
	System.out.println("memory location for alphaCoach:  "+alphaCoach);
	System.out.println(theCoach.getDailyFortune());
	
	 context.close();
	}

}
