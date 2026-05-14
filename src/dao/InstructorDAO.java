package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBConnection;
import model.Instructor;

public class InstructorDAO {
    public void addInstructor() {

    }

    public List<Instructor> viewInstructor() {
        List<Instructor> instructors = new ArrayList<>();
        String sql = "select * from instructors";

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("instructor_id");
                String name = resultSet.getString("instructor_name");
                String email = resultSet.getString("instructor_email");

                Instructor instructor = new Instructor(
                        id, name, email);
                instructors.add(instructor);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return instructors;
    }

    public void assignInstructorToCourse() {

    }

    public void removeAssignment() {

    }

}
