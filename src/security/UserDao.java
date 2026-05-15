package security;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBConnection;

public class UserDao {

    public void findUserByEmail() {
        String sql = "select ";
        try {
            Connection connection = DBConnection.getConnection();
            Statement s = connection.createStatement();
            s.executeQuery(sql);

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
