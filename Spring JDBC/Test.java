package com.webapps.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
	
	int status =dao.saveEmployee(new Employee(101,"sheru",25000));
	System.out.println(status);
	}

}
