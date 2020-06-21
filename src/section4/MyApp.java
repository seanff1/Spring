package section4;

public class MyApp {
	
	public static void main(String[] args) {
		//~~Tasklist~~
		//1) Create the object
		//2) Use the object
		
		//1)Create
		Coach theCoach = new LeagueCoach();
		
		//2) Use object
		System.out.println(theCoach.getDailyWorkout());
	}
}
