package application;

import db.DB;

import java.sql.*;

public class Update {
    public static void main(String[] args) {
        Connection conn;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "Id = ?"
            );
            st.setDouble(1,500.0);
            st.setInt(2, 1);

            int rowsAffected = st.executeUpdate();
            System.out.println("Linhas afetadas: " + rowsAffected);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
