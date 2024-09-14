package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Aafirst {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Connection con = null;
        try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            System.out.println("Connecting to database...");       // JDBC URL, username, and password of MySQL server
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdbms", "root","12345678@");
            
            System.out.println("Connected to the database successfully!   Enter the name of the table: ");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("insert into ak values (\"Ravi Kant Sahu\", 535)");
            


        } catch (SQLException e) {
            System.out.println("Connection failed! Check output console");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


