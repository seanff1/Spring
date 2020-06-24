package section6;

import section5.FortuneService;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void startup()
	{
		System.out.println("Startup");
	}
	
	// add a destory method
	public void destroyBean()
	{
		System.out.println("Destroy");
	}
}
