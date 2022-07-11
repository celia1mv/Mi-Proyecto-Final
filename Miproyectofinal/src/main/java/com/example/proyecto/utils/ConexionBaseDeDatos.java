package com.example.proyecto.utils;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    private static String url = "jdbc:mysql://localhost:3306/doggo?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "1234";
    private static BasicDataSource pool;

    // Crea el pool
    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setDriverClassName("com.mysql.cj.jdbc.Driver");
            pool.setUsername(username);
            pool.setPassword(password);
            pool.setInitialSize(3); //<-- cantidad de conexiones habilitadas al inicio. Por defecto, es 0
            pool.setMinIdle(3);     //<-- min. de conexiones esperando para ser utilizadas. Por defecto, es 0
            pool.setMaxIdle(8);     //<-- idem, pero máximo
            pool.setMaxTotal(20);    //<-- Total de conexiones entre inactivas (sin utilizar) y utilizadas
        }
        return pool;
    }

    // Devuelve una conexión del pool
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
