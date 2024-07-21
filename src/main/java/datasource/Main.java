package datasource;


import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection MyCon = MySqlConnection.getConnection();
            System.out.println("success Connection ");
        }
        catch(SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
