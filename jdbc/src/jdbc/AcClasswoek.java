package jdbc;

import java.sql.*;
import java.sql.DriverManager;

public class AcClasswoek {
	public static void main(String [] ak)  {
		try {
         
			// Print all the data form table employ form database firstdbms
			
            Class.forName("com.mysql.cj.jdbc.Driver");
          
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdbms", "root", "Ankit1234@");
         
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM employ");
           
            while (rs.next()) {
          
                int id = rs.getInt("id");
                String name = rs.getString("nam");
                double cgpa = rs.getDouble("cgpa");
                
                System.out.println("ID: " + id + ", Name: " + name + ", CGPA: "+cgpa);
                
            }
            
            // To print only table name;
            ResultSet rs2 = stmt.executeQuery("SELECT table_name FROM information_schema.tables WHERE table_schema = 'firstdbms'");

            System.out.println("\nTables in firstdbms:");
            while (rs2.next()) {
                String tableName = rs2.getString("table_name");
                System.out.println(tableName);
            }
            
            rs2.close();
            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
		
	
	}
}

