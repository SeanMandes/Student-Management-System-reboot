package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DBConnection;
import model.Course;
import model.Student;

public class EnrollmentDAO {
    public void enrollStudent(Student student, Course course) {
        String sql = "insert into enrollment (student_id, course_id) values(?, ?)";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, student.getId());
            int sID = student.getId();
            ps.setInt(2, course.getId());
            int cID = course.getId();
            System.out.println("Student ID: " + sID);
            System.out.println("Student ID: " + cID);

            String sname = student.getName();
            String cname = course.getCourseName();
            System.out.println("Student ID: " + sname);
            System.out.println("Student ID: " + cname);

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
