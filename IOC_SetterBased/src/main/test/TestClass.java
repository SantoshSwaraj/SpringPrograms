package main.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.User;

public class TestClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User)context.getBean("user");
		
		System.out.println("Car Name :"+user.getCar().getName());
		System.out.println("Car perdayCost	:"+user.getCar().getPerdayCost());
	}

}