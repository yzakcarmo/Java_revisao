package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 2");

//            int x = 1;
//            if (x < 2) throw new SQLException("FakeError");

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 5000 WHERE DepartmentId = 3");

            conn.commit();

            System.out.println("Rows1: " + rows1);
            System.out.println("Rows2: " + rows2);
        }
        catch (SQLException e) {
            try{
                conn.rollback();
                throw new DbException("Transação não concluida, rollback causado por: " + e.getMessage());
            }
            catch (SQLException e1) {
                throw new DbException("Erro ao tentar rollback causado por: " + e1.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}