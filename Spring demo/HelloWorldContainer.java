package com.webapps.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloWorldContainer {
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormTwo")
	public String letsshoutDude(HttpServletRequest request, Model model) {	
		String theName= request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = theName;
		model.addAttribute("message", result);
		return "helloworld";
	}



	@RequestMapping("/processFormThree")
	public String ProcessFormVersionThree (@RequestParam("studentName") String theName, Model model) {	
		theName = theName.toUpperCase();
		String result = theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
}
