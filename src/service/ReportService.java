package service;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import db.DBConnection;

public class ReportService {
    public void fullReport() {
        String sql = "select s.student_name, c.course_name, e.grade\r\n" + //
                "from students as s\r\n" + //
                "left join enrollment  as e on s.student_id = e.student_id\r\n" + //
                "left join courses as c on c.course_id = e.course_id";

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String s_name = resultSet.getString("student_name");
                String c_name = resultSet.getString("course_name");
                String grade = resultSet.getString("grade");
                System.out.println(
                        "Student name: " + s_name + " - " + "Course name: " + c_name + " - " + "Grade: " + grade);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void studentPerCourse() {

    }
}
