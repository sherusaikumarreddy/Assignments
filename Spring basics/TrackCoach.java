package com.webapps.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//FortuneService fs = new HappyFortuneService(); 
	
	@Override
	public String getDailyWorkput() {

		return "track coach- Running";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getDailyFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside the startupstuff");
	}

	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside the domycleanupstuff");
	}

}
