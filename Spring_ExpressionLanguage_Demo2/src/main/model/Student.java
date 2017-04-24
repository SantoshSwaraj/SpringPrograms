package main.model;

public class Student {
	private Integer studId;
	private String studName;
	private String currentCity;
	private Hostel hostel;
	/**
	 * @return the studId
	 */
	public Integer getStudId() {
		return studId;
	}
	/**
	 * @param studId the studId to set
	 */
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	/**
	 * @return the studName
	 */
	public String getStudName() {
		return studName;
	}
	/**
	 * @param studName the studName to set
	 */
	public void setStudName(String studName) {
		this.studName = studName;
	}
	/**
	 * @return the currentCity
	 */
	public String getCurrentCity() {
		return currentCity;
	}
	/**
	 * @param currentCity the currentCity to set
	 */
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}
	/**
	 * @return the hostel
	 */
	public Hostel getHostel() {
		return hostel;
	}
	/**
	 * @param hostel the hostel to set
	 */
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	
}
