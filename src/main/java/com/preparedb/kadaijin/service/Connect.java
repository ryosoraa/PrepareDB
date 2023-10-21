package com.preparedb.kadaijin.service;

import java.sql.*;
// import org.postgresql.ds.PGSimpleDataSource;

public class Connect {
    // public Connection cockroachDB() throws SQLException {
    // PGSimpleDataSource cockSource = new PGSimpleDataSource();

    // cockSource.setURL(
    // "jdbc:postgresql://shrewd-boxer-6752.8nk.cockroachlabs.cloud:26257/kadaijin?sslmode=verify-full");
    // cockSource.setUser("ryo");
    // cockSource.setPassword("9bPaq-ZymIpT3GCJn0qyqA");

    // Connection conect = cockSource.getConnection();
    // return conect;
    // }

    private final String url = "jdbc:mysql://localhost:3306/kadaijin";
    private final String user = "root";
    private final String password = "";

    static Connection connect = null;

    public Connection connection() throws SQLException {
        connect = DriverManager.getConnection(url, user, password);
        return connect;
    }

}
