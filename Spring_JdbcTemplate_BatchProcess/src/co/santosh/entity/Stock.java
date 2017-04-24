package co.santosh.entity;

public class Stock {
	
	String name;
	String category;
	int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getNumber() {
		return number;
	}
	public Stock(String name, String category, int number) {
		super();
		this.name = name;
		this.category = category;
		this.number = number;
	}
	public void setNumber(int number) {
		this.number = number;
	}	

}

