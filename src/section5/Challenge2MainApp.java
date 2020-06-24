package section5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Challenge2MainApp {
	
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("challenge2applicationContext.xml");
		//retrieve bean from spring container
		Challenge2Coach theCoach = context.getBean("myCoach", Challenge2Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();
		

		

	}

}
