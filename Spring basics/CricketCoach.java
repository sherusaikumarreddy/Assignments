package com.webapps.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Set email address achieved");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Set team name achieved");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkput() {
			return "Cricket";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

}
