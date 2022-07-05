import util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo11 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            String sql1 = "update  account set balance = balance - ? where id= ?";
            String sql2 = "update  account set balance = balance + ? where id= ?";

            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);

            preparedStatement1.setDouble(1, 500);
            preparedStatement1.setInt(2, 1);

            preparedStatement2.setDouble(1, 500);
            preparedStatement2.setInt(2, 2);

            preparedStatement1.executeUpdate();
            int i = 3 / 0;
            preparedStatement2.executeUpdate();

            connection.commit();
        } catch (Exception e) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(preparedStatement1, connection);
            JDBCUtils.close(preparedStatement2, null);
        }
    }
}
