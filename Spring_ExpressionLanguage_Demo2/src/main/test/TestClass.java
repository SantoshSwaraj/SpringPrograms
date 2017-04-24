package main.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.Student;

public class TestClass {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stud = (Student)context.getBean("student");
		System.out.println("Student id:"+stud.getStudId());
		System.out.println("Student name:"+stud.getStudName());
		System.out.println("Hostel Name : "+stud.getHostel().getHostelName());
		System.out.println("City : "+stud.getHostel().getCity());
	}
}
