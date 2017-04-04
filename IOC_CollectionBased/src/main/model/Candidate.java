package main.model;

public class Candidate {
	private String name;
	private Certificate certificates;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(String name, Certificate certificates) {
		super();
		this.name = name;
		this.certificates = certificates;
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
	 * @return the certificates
	 */
	public Certificate getCertificates() {
		return certificates;
	}
	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(Certificate certificates) {
		this.certificates = certificates;
	}
	
	
}
