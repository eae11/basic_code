package c2;

import java.sql.*;

public class Test1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/shopdb";
        String driveClass = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "";

        try {
            Class.forName(driveClass);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = conn.prepareStatement("select * from t_user");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
