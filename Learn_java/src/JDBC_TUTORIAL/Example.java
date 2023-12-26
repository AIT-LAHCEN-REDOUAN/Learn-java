package JDBC_TUTORIAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example {
    static final String DB_URL = "jdbc:mysql://localhost:3306/pospay";
    static final String user = "root";
    static final String password = "";
    static final String Query = "SELECT * FROM utilisateurs";

    public static void main(String[] Args) {
        long start = System.currentTimeMillis();

        try (Connection conn = DriverManager.getConnection(DB_URL, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(Query)) {

            try (Statement insertStmt = conn.createStatement()) {
                insertStmt.executeUpdate("INSERT INTO utilisateurs(username,password,role) VALUES('amine','kashdjkas','Admin')");
            }
            // Process the SELECT results
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("username: " + rs.getString("username"));
            }

            // Insert a new record (example)


        } catch (SQLException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + "ms");
    }
}
