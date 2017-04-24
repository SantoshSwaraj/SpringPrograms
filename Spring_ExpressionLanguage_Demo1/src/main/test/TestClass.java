package main.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.UsingSpEL;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UsingSpEL usingSpEL = (UsingSpEL)context.getBean("usingSpEl");
		System.out.println(usingSpEL.getEqualCheck());
		System.out.println(usingSpEL.getConcat());
		System.out.println(usingSpEL.getExponent());
	}

}
