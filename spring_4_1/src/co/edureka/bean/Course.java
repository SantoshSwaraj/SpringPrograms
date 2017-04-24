package co.edureka.bean;

public class Course {

	String courseTitle;
	String courseId;
	int price;
	
	
	public Course() {
		super();
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public Course( String courseId,String courseTitle, int price) {
		super();
		this.courseTitle = courseTitle;
		this.courseId = courseId;
		this.price = price;
	}
	
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
