package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBConnection;
import model.Course;
import model.Student;

public class EnrollmentDAO {
    public void enrollStudent(int student_id, int course_id) {
        String sql = "insert into enrollment (student_id, course_id) values(?, ?)";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);

            if (enrollmentAlreadyExist(student_id, course_id)) {
                System.out.println("Enrollment already existed");
                return;
            }

            ps.setInt(1, student_id);
            ps.setInt(2, course_id);

            ps.executeUpdate();
            System.out.println("Enrollment added!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean enrollmentAlreadyExist(int student_id, int course_id) {
        String sql = "select * from enrollment where student_id = ? and course_id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, student_id);
            preparedStatement.setInt(2, course_id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void removeEnrollment() {

    }

    public void assignGrade(Student student, Course course) {

    }

}
