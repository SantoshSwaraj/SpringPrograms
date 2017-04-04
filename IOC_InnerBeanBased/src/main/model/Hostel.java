package main.model;

public class Hostel {
	private String hostelName;
	private String city;
	public Hostel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hostel(String hostelName, String city) {
		super();
		this.hostelName = hostelName;
		this.city = city;
	}
	/**
	 * @return the hostelName
	 */
	public String getHostelName() {
		return hostelName;
	}
	/**
	 * @param hostelName the hostelName to set
	 */
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

}
