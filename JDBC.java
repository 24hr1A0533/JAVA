import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/food";
        String username = "root";
        String password = "password@123";
        String queres="select * from snacks";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection(url,username,password);
            Statement s =con.createStatement();
            String quere="select * from snacks";
            ResultSet rs=s.executeQuery(quere);
             while (rs.next()) {
                int s_no =rs.getInt("s_no");
                String snack=rs.getNString("snack");
                int cost=rs.getInt("cost");
                System.out.println(s_no+" "+snack +" "+ cost);
            }
            rs.close();
            s.close();
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}