package section5;

import java.util.Random;

public class Challenge2RandomFortune  {

	public String getFortune() {
		String[] randomFortune = new String[] {"Meh Day","Ok Day", "Awesome Day"};
		
		return randomFortune[new Random().nextInt(randomFortune.length)];
	}


}
