package section5;

public class Challenge2Coach implements Coach{
	
	private Challenge2RandomFortune randomFortune;
	
	public Challenge2Coach(Challenge2RandomFortune randomFortune) {
		this.randomFortune = randomFortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Do your java studying!";
	}

	@Override
	public String getDailyFortune() {
		return randomFortune.getFortune();
	}
	
}
