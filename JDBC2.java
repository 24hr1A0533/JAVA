import java.sql.*;
import java.util.Scanner;

public class JDBC2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/food";
        String username = "root";
        String password = "password@123";
        String query = "update snacks set cost=70 where s_no=3";

        try ( 
            Connection con=DriverManager.getConnection(url,username,password);
            PreparedStatement ps=con.prepareStatement(query);
           
        )
        {   ps.setInt(1, 70);
            ps.setInt(2, 3);
             ps.executeUpdate();
             con.close();
        }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
