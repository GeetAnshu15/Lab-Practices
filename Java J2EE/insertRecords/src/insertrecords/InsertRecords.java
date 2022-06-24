package insertrecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class InsertRecords 
{
    static final String DB_URL = "jdbc:mysql://localhost/automobiles";
    static final String USER = "root";
    static final String PASS = "";
    public static void main(String[] args) 
    {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();)
        {
            System.out.println("Inserting records into the table...");          
            String sql = "INSERT INTO cars VALUES (1, 'Venue', 'Hyundai', 'SUV', 'Petrol', 950260)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES (2, 'Nexon', 'Tata', 'SUV', 'Electric', 1685990)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES (3, 'Virtus', 'Volkswagen', 'Sedan', 'Diesel', 1245945)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES(4, 'Slavia', 'Skoda', 'Sedan', 'Petrol', 1064780)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES(5, 'Swift', 'Suzuki', 'Hatchback', 'Diesel', 716299)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES(6, 'Model 3', 'Tesla', 'Sedan', 'Electric', 3545990)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES(7, 'X3', 'BMW', 'SUV', 'Diesel', 4278099)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES(8, '911 Turbo S', 'Porsche', 'Sports', 'Petrol', 5923940)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES(9, 'Huracan EVO', 'Lamborghini', 'Sports', 'Diesel', 15968740)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO cars VALUES(10, 'Cullinan', 'Rolls Royce', 'SUV', 'Diesel', 28966320)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        }
        catch(SQLException e)        
        {
            e.printStackTrace();
        }
        
    }
    
}
