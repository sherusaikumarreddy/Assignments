package com.webapps.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	 
	public String getDailyWorkput() {
		return "Baseball Coach- spend 30 min";
	}
 
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}
	
}

