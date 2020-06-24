package section6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import section6.Coach;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {
		
		//load spring
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
	
		//retrieve spring from bean container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Call functions
		System.out.println(theCoach.getDailyWorkout());
		
		//Close
		context.close();
	}

}
