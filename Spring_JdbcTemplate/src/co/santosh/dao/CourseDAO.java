package co.santosh.dao;

import co.santosh.entity.Course;

public interface CourseDAO {
	public void insertCourse(Course course);
	public void deleteCourse(String courseName);
	public Course getCourse(String courseName);
	public void updateCourse(String courseName, Course updatedCourse);
}
