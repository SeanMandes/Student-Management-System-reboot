import db.DBConnection;

public class Main {

    public static void main(String[] args) {

        DBConnection dbc = new DBConnection();
        dbc.fetchStudents();

    }
}
