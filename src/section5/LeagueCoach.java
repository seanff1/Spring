package section5;

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
