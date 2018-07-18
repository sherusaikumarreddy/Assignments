package com.webapps.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
@Autowired 
	private FortuneService fortuneService;
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/
	@Override
	public String getDailyworkout() {
		return "TennisCoach has implemented the coach interface";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
