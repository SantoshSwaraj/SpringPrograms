package co.santosh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.santosh.Course;
import co.santosh.dao.CourseDAO;



public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CourseDAO courseDAO=(CourseDAO)context.getBean("courseDAO");	
		Course course=new Course("javascript","Angular JS",23000);
		courseDAO.insertCourse(course);
		
		
	}
	
}
