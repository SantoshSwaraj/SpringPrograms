package co.santosh.entity;

public class MobilePhone {
	
	private int product_id;
	private String manufacturer;
	private int price;
	private String color;
	
	public MobilePhone() { } // default constructor

	public MobilePhone(int product_id, String manufacturer, int price, String color) { //parameterized constructor
		this.product_id = product_id; 
		this.manufacturer = manufacturer;
		this.price = price;
		this.color = color;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

