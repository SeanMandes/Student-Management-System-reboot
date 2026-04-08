package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from students";
        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt("student_id"),
                        resultSet.getString("student_name"),
                        resultSet.getString("student_email"),
                        resultSet.getInt("age"));
                students.add(student);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
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
