package main.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.Student;

public class TestClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("alias-student");
		
		
		System.out.println("Student_Name :"+student.getName());
		System.out.println("Student_id   :"+student.getId());
		System.out.println("Student_HostelName: "+student.getHostel().getHostelName());
		System.out.println("Student_HostelCity :"+student.getHostel().getCity());
		
		System.out.println("==============================================");
		
		Student student1 = (Student)context.getBean("student");
		System.out.println("Student_Name :"+student1.getName());
		System.out.println("Student_id   :"+student1.getId());
		System.out.println("Student_HostelName: "+student1.getHostel().getHostelName());
		System.out.println("Student_HostelCity :"+student1.getHostel().getCity());
		
		

	}

}  
