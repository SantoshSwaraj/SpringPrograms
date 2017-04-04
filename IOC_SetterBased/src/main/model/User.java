package main.model;

public class User {
	private Car car;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Car car) {
		super();
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
}
