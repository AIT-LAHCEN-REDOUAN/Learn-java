package JDBC_TUTORIAL;

import javax.swing.*;
import java.sql.*;

public class Example {
    static final String DB_URL = "jdbc:mysql://localhost:3306/pospay";
    static final String user = "root";
    static final String password = "";

    static final String Query = "SELECT * FROM utilisateurs";


    public static void main(String[] Args){
        long start  = System.currentTimeMillis();
        try(

                Connection conn = DriverManager.getConnection(DB_URL,user,password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(Query);
                  

        ){
            while (rs.next()){
                System.out.println("id : "+rs.getInt("id"));
                System.out.println("username : "+rs.getString("username"));
            }
        }catch (SQLException e){
            e.printStackTrace();;
        }
        long end = System.currentTimeMillis();

        System.out.println("Time : "+(end-start) + "ms");

    }

}
