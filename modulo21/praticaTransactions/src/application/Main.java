package application;

import db.DB;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn;
        Statement st = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 2");

            int x = 1;
            if (x < 2) throw new SQLException("FakeError");


            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 5000 WHERE DepartmentId = 3");

            System.out.println("Rows1: " + rows1);
            System.out.println("Rows2: " + rows2);
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