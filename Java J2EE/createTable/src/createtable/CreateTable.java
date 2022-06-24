package createtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable 
{
    static final String DB_URL = "jdbc:mysql://localhost/automobiles";
    static final String USER = "root";
    static final String PASS = "";
    public static void main(String[] args) 
    {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
        )
        {
           String sql = "CREATE TABLE cars " +
                   "(id INTEGER not NULL, " +
                   " name VARCHAR(255), " + 
                   " manufac VARCHAR(255), " + 
                   " type VARCHAR(255), " + 
                   " fuel VARCHAR(255), " + 
                   " cost VARCHAR(255), " + 
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
    }
    
}
