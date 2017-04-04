package main.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.model.SampleBean;

public class TestClass {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("===Singleton Bean1=======");
		SampleBean sampleBean = (SampleBean)context.getBean("sampleBean");
		sampleBean.setBeanName("Santosh");
		System.out.println(sampleBean.getBeanName());
		
		System.out.println("===Singleton Bean2=======");
		SampleBean sampleBean1 = (SampleBean)context.getBean("sampleBean");
		System.out.println(sampleBean1.getBeanName());
		
		System.out.println("===Prototype Bean1=======");
		SampleBean sampleBean2 = (SampleBean)context.getBean("sampleBean1");
		sampleBean2.setBeanName("Edureka");
		System.out.println(sampleBean2.getBeanName());
		
		System.out.println("===Prototype Bean1=======");
		SampleBean sampleBean3 = (SampleBean)context.getBean("sampleBean1");
		System.out.println(sampleBean3.getBeanName());
		
		
		
	}
}
