package com.minhle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//To run this file we need to have SpringFrameWork latest version
		//file xml need to place under src file directory

		//Go to Project Structure, in Module , add Spring and file xml
		//In Library, add libs file from Spring Framework
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.letCheckMyLuck());
		System.out.println("\n----------------------------------------\n");


		//Do some more example
		Coach secondCoach = context.getBean("myCoachCanSet",Coach.class);
		System.out.println(secondCoach.getDailyWorkout());
		System.out.println(secondCoach.letCheckMyLuck());
		System.out.println("\n----------------------------------------\n");


		//Do some example with literal argument
		Coach thirdCoach = context.getBean("myCoachWithLiteralSet",Coach.class);
		System.out.println(thirdCoach.getDailyWorkout());
		System.out.println(thirdCoach.letCheckMyLuck());
		System.out.println(thirdCoach.toString());
		System.out.println("\n----------------------------------------\n");

		//Do some example with random exercise class
		Coach fourthCoach = context.getBean("myCoachWithRandomExercises",Coach.class);
		System.out.println(fourthCoach.getDailyWorkout());
		System.out.println(fourthCoach.letCheckMyLuck());
		// close the context
		context.close();
	}

}







