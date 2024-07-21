package datasource;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class MyTest {
    public static void main(String[] args) {
        Connection MyCon = DsConnection.getConnection();
    }
}
