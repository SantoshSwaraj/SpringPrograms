package main.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.SampleBean;

public class TestClass {
	public static void main(String args[]){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("====Setter Based Injection===");
		SampleBean sampleBean = (SampleBean)context.getBean("sampleBean");
		System.out.println(sampleBean.getBeanName());
		sampleBean.simpleMessage();
		
		
		System.out.println("====Constructor Based Injection===");
		SampleBean sampleBean1 = (SampleBean)context.getBean("sampleBean1");
		System.out.println(sampleBean1.getBeanName());
		sampleBean1.simpleMessage();
		
		context.close();
	}
}
