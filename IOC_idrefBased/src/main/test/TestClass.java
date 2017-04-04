package main.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.ClientClass;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClientClass client = (ClientClass)context.getBean("client");
		System.out.println(client.getTargetClass().getTargetName());

	}

}
