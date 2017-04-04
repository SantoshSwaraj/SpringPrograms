package main.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.Candidate;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Candidate candidate = (Candidate)context.getBean("candidate");
		
		System.out.println("Candidate Name :"+candidate.getName());
		System.out.println(candidate.getCertificates());

	}

}
