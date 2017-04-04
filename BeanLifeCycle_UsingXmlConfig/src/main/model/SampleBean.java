package main.model;

public class SampleBean {
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
	
	public void init(){
		System.out.println("Inside init method");
	}
	
	public void destroy(){
		System.out.println("Inside destory method");
	}
}
