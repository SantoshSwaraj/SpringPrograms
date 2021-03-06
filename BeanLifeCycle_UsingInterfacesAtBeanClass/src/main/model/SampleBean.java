package main.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SampleBean implements InitializingBean, DisposableBean{
	private String beanName;

	public SampleBean() {
		super();
		System.out.println("Inside default constructor");
	}

	public SampleBean(String beanName) {
		super();
		this.beanName = beanName;
		System.out.println("Inside parameterized constructor");
	}

	/**
	 * @return the beanName
	 */
	public String getBeanName() {
		System.out.println("Inside getterMethod");
		return beanName;
	}

	/**
	 * @param beanName the beanName to set
	 */
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println("Inside setterMethod");
	}
	
	public void simpleMessage(){
		System.out.println("Hello "+this.getBeanName());
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy Method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Init Method");
		
	}

}

