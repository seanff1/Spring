package section6;

import section6.Coach;
import section5.FortuneService;

public class LeagueCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public LeagueCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins running it down mid";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
