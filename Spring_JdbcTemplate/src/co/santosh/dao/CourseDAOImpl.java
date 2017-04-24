package co.santosh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import co.santosh.entity.Course;

public class CourseDAOImpl implements CourseDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertCourse(Course course) {
		String sql = "insert into course(id,title,price) values('"+course.getCourseId()+"',"
				+ "'"+course.getCourseTitle()+"','"+course.getPrice()+"')";
		jdbcTemplate.update(sql);
		System.out.println("Course Inserted Successfully..");

	}

	@Override
	public void deleteCourse(String courseName) {
		String sql = "delete from course where title='"+courseName+"'";
		jdbcTemplate.update(sql);
		System.out.println("Course with title "+courseName+" is deleted Successfully..");
	}

	@Override
	public Course getCourse(String courseName) {
		String sql = "select *from course where title = '"+courseName+"'";
		return (Course)jdbcTemplate.queryForObject(sql, new RowMapper<Course>(){

			@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course = new Course();
				course.setCourseId(rs.getString("id"));
				course.setCourseTitle(rs.getString("title"));
				course.setPrice(rs.getInt("price"));
				return course;
			}
			
		});
	}

	@Override
	public void updateCourse(String courseName, Course updatedCourse) {
		String sql = "update course set id = ?, title= ?, price= ? where title='"+courseName+"'";
		Object params[] = {updatedCourse.getCourseId(),updatedCourse.getCourseTitle(),updatedCourse.getPrice()};
		jdbcTemplate.update(sql, params);
		System.out.println("Course updated successfully..");
	}

}
