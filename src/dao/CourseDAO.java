package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBConnection;
import model.Course;

public class CourseDAO {
    public void addCourse(Course course) {
        String sql = "insert into courses(course_name, instructor) values (?, ?)";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, course.getCourseName());
            ps.setString(2, course.getInstructor());

            ps.executeUpdate();
            System.out.println("Course added!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        String sql = "select * from courses";
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Course course = new Course(
                        resultSet.getInt("course_id"),
                        resultSet.getString("course_name"),
                        resultSet.getString("instructor"));
                courses.add(course);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;
    }

    public void updateCourse(int course_id, String course_name, String instructor) {
        String sql = "update courses set course_name = ?, instructor = ? where course_id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(3, course_id);
            ps.setString(1, course_name);
            ps.setString(2, instructor);

            ps.executeUpdate();
            System.out.println("Course updated!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCourse(int id) {
        String sql = "delete from courses where course_id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Course removed!");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
