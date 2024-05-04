package org.example.platzi.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static final String url = "jdbc:mysql://localhost:3306/projectPlatzi";
    private static final String user = "root";
    private static final String pass = "12345";

    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(user);
            pool.setPassword(pass);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMinIdle(10);
            pool.setMaxTotal(10);
        }
        return pool;
    }

    // Método que obtendra una sola conexión del pool
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }

}
