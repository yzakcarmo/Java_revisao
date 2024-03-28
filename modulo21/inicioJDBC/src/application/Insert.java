package application;

import db.DB;

import java.sql.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Insert {
    public static void main(String[] args) {
        Connection conn;
        PreparedStatement st = null;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT into seller"
                    + "(Name, Email, Birthdate, BaseSalary, DepartmentId)"
                    + "VALUES "
                    + "(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            st.setString(1, "Joao Roxo");
            st.setString(2, "joao@roxo.com");
            st.setDate(3, Date.valueOf(LocalDate.parse("28/03/2024", fmt)));
            st.setDouble(4,5000.0);
            st.setInt(5, 1);

            int rowsAffected = st.executeUpdate();
            System.out.println("Linhas afetadas: " + rowsAffected);

            if(rowsAffected > 0 ) {
                ResultSet rs = st.getGeneratedKeys();
                int i = 1;
                System.out.println("Ids criados:");
                while(rs.next()) {
                    int id = rs.getInt(i);
                    System.out.println(id);
                }
            }
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
