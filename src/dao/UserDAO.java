package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import db.DBConnection;

public class UserDAO {

    public void findUserByEmail(String user_email) {
        String sql = "SELECT * FROM user WHERE user_email = ?";
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user_email);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("userID");
                String email = rs.getString("user_email");
                String password = rs.getString("password");
                String role = rs.getString("role");
                System.out.println(
                        "USER ID: " + id + "\n" +
                                "USER EMAIL: " + email + "\n" +
                                "USER PASSWORD: " + password + "\n" +
                                "USER ROLE: " + role);
            } else {
                System.out.println("User doesn't exist!");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void validateCredentials() {

    }

    public void createUser() {

    }

}
