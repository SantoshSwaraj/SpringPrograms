package co.edureka.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.bean.Course;

public class CourseDAO {
    @Autowired
	private JdbcTemplate jdbcTemplate; 
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
    	this.jdbcTemplate=jdbcTemplate;
    }
	
    public void insertCourse(Course course) {	
		
		jdbcTemplate.update("insert into course(id,title,price) values ('"+course.getCourseId()+"','"+course.getCourseTitle()+"', '"+course.getPrice()+"')  ") ;	
		System.out.println("Course Added successfully");
	}
    
    public void deleteCourse(String courseName) {	
		
		String sql="delete from course where title='"+courseName+"' ";		
		jdbcTemplate.update(sql);   
		System.out.println("Course with title "+courseName+" have been deleted");
	}
    
    public Course getCourse(String courseName){
    	return (Course) jdbcTemplate.queryForObject("select * from course where title='"+courseName+"' ",
				new RowMapper<Course>() {

					public Course mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Course course = new Course();

						course.setCourseId(rs.getString("id"));
						course.setCourseTitle(rs.getString("title"));
						course.setPrice(rs.getInt("price"));
						
						return course;
					}

				});			
    }
    
  public void updateCourse(String courseName, Course updatedCourse){
		
				
		Object params[]={updatedCourse.getCourseTitle(),updatedCourse.getCourseId(),updatedCourse.getPrice()};
		String sql="update course set title=? , id=? ,price=? where title='"+courseName+"'  ";
			
		System.out.println(sql);
		jdbcTemplate.update(sql, params);
	}
	
	
}
