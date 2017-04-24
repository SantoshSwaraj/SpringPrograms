package co.edureka.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import co.edureka.bean.Course;

import co.edureka.dao.CourseDAO;


public class TestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CourseDAO courseDAO=(CourseDAO)context.getBean("courseDAO");	
		Course course1=new Course("javascript","Angular JS",23000);
		Course course2=new Course("framework","Spring Framework 4",18000);
		courseDAO.insertCourse(course1);
		courseDAO.insertCourse(course2);
		courseDAO.deleteCourse("Angular JS");
		
		Course course=courseDAO.getCourse("Spring Framework 4");
		System.out.println(course.getCourseId()+" "+course.getCourseTitle()+" "+course.getPrice());
		
		Course updatedCourse=new Course("framework","Spring Framework 4.1.2",17000);
		courseDAO.updateCourse("Spring Framework 4", updatedCourse);
	}
	
}
