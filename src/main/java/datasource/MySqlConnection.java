package datasource;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class MySqlConnection {
    // Définir les informations de la base de données
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ItemsDB";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    // Créer un objet DataSource
    private static DataSource dataSource ;

    static {
        // Initialiser et configurer le pool de connexions
        MysqlDataSource ds = new MysqlDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUser(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);

        // Paramètres supplémentaires du pool de connexions
//        ds.setMinIdle(5);
//        ds.setMaxIdle(10);
//        ds.setMaxOpenPreparedStatements(100);

        // Définir le DataSource
        dataSource = ds;
    }

    // Méthode pour récupérer une connexion à partir du pool
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}