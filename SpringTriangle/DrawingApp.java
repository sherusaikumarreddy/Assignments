package com.webapps.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
   
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");	
		
		Triangle t= (Triangle) context.getBean("triangle");
		t.draw();
		
	}

}
