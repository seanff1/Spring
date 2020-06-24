package section7;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Goal : Pick random string from array
	
	//1 String Array
	private String[] anArray = 
		{"Random1","Random2","Random3"};
	
	
	//2 Intiatilise Random Class
	private Random aRandom = new Random();
	
	
	//3 Store random number based on array length
	private int index = aRandom.nextInt(anArray.length);
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Random Fortune Service - getFortune() - " + anArray[index];
	}

}
