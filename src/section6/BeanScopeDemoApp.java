package section6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import section6.Coach;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		//load spring
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
	
		//retrieve spring from bean container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = theCoach == alphaCoach;
		
		System.out.println(result);
	}

}
