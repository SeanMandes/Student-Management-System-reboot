package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DBConnection;
import model.Course;
import model.Student;

public class EnrollmentDAO {
    public void enrollStudent(Student student, Course course) {
        String sql = "insert into enrollment (student_id, course_id, grade) values(?, ?, ?)";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, student.getId());
            ps.setInt(2, course.getId());
            ps.setString(3, null);

            ps.executeUpdate();
            System.out.println("Enrollment added!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeEnrollment() {

    }

    public void assignGrade(Student student, Course course) {

    }

}
