package section4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		//Tasklist
		//1) Load spring config file
		//2) Retreieve bean from spring container
		//3) call methods on the beans
		//4) close the context
		
		//1) load
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2) Retrieve
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//3) call methods
		System.out.println(theCoach.getDailyWorkout());
		
		//4 close
		context.close();
		
		
	}

}
