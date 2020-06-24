package section5;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add fields
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach  -  No-Arg Constructor Called");
	}
	
	//Setter Method
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("CricketCoach  -  inside setter method");
		this.fortuneService = fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "practise fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
