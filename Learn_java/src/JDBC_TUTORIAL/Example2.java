package JDBC_TUTORIAL;

import java.sql.*;

public class Example2 {

    public void ConnectDB() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pospay","root","");
            System.out.println("Connection Success !!");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("INSERT INTO `utilisateurs` VALUES('amine','kashdjkas','Admin')");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }


    public static void main(String[] Args){

    }
}
