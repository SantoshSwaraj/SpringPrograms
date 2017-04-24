package main.model;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("22110")
	private Integer houseNo;
	@Value("Akash-Vila")
	private String houseName;
	@Value("Ring Road, MG Marg")
	private String street;
	@Value("Patna")
	private String city;
	/**
	 * @return the houseNo
	 */
	public Integer getHouseNo() {
		return houseNo;
	}
	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}
	/**
	 * @return the houseName
	 */
	public String getHouseName() {
		return houseName;
	}
	/**
	 * @param houseName the houseName to set
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
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

