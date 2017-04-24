package main.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.Employee;

public class TestClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp1 = (Employee)context.getBean("employee");
		System.out.println("Employee id: "+ emp1.getEmpId());
		System.out.println("Employee Name: "+emp1.getEmpName());
		System.out.println("====Employee Address========");
		System.out.println("HouseNo:"+emp1.getAddress().getHouseNo());
		System.out.println("HouseName :"+emp1.getAddress().getHouseName());
		System.out.println("Street : "+emp1.getAddress().getStreet());
		System.out.println("City : "+emp1.getAddress().getCity());
		context.close();

	}

}
