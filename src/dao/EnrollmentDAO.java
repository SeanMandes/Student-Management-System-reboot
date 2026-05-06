package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBConnection;

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
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void removeEnrollment(int student_id, int course_id) {
        String sql = "delete from enrollment where student_id = ? and course_id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            if (!enrollmentAlreadyExist(student_id, course_id)) {
                System.out.println("Enrollment doesnt exist!");
                return;
            }

            preparedStatement.setInt(1, student_id);
            preparedStatement.setInt(2, course_id);

            preparedStatement.executeUpdate();

            System.out.println("Enrollment removed!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void assignGrade(String grade, int student_id, int course_id) {
        String sql = "update enrollment set grade = ? where student_id = ? and course_id = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            if (!enrollmentAlreadyExist(student_id, course_id)) {
                System.out.println("Enrollment doesnt exist!");
                return;
            }

            preparedStatement.setString(1, grade);
            preparedStatement.setInt(2, student_id);
            preparedStatement.setInt(3, course_id);
            preparedStatement.executeUpdate();

            System.out.println("Grade assigned!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
