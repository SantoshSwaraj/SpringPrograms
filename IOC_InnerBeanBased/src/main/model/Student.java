package main.model;

public class Student {
	private String name;
	private String id;
	private Hostel hostel;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String id, Hostel hostel) {
		super();
		this.name = name;
		this.id = id;
		this.hostel = hostel;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
