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

    public void updateStudent(int id, String student_name, String student_email, int age) {
        String sql = "update students set student_name = ?, student_email = ?, age = ? where student_id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, student_name);
            ps.setString(2, student_email);
            ps.setInt(3, age);
            ps.setInt(4, id);

            ps.executeUpdate();
            System.out.println("Student updated!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String sql = "delete from students where student_id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Student removed!");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
