package main.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.Authenticate;

public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Authenticate obj=(Authenticate)context.getBean("proxy");		
		try {
			obj.authenticate("12345");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
