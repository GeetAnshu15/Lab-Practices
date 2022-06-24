package checkcond;

import java.sql.*;

public class CheckCond 
{
    static final String DB_URL = "jdbc:mysql://localhost/automobiles";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM cars WHERE ";
    public static void main(String[] args) 
    {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);)
        {
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
}
