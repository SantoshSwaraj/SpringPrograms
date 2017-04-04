package main.model;

public class Car {
	private String name;
	private int perdayCost;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, int perdayCost) {
		super();
		this.name = name;
		this.perdayCost = perdayCost;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the perdayCost
	 */
	public int getPerdayCost() {
		return perdayCost;
	}
	/**
	 * @param perdayCost the perdayCost to set
	 */
	public void setPerdayCost(int perdayCost) {
		this.perdayCost = perdayCost;
	}
	
	
}
