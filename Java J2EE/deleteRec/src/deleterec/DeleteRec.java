package deleterec;

import java.sql.*;

public class DeleteRec 
{
    static final String DB_URL = "jdbc:mysql://localhost/automobiles";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT id, name, manufac, type, fuel, cost FROM cars";
    public static void main(String[] args) 
    {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();)
        {
            String sql = "DELETE FROM cars WHERE id=11";
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next())
            {
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Manufacturer: "+rs.getString("manufac"));
                System.out.println("Type: "+rs.getString("type"));
                System.out.println("Fuel: "+rs.getString("fuel"));
                System.out.println("Cost: "+rs.getInt("cost"));
                System.out.print("\n");
            }
            rs.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
}
