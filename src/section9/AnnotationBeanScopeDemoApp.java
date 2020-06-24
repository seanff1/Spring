package section9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import section9.Coach;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext9.xml");
		
		
		//retrieve bean 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Are they the same object? " + result);
		
		//close context
		context.close();
		
	}

}
