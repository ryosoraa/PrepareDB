package com.preparedb.kadaijin.service;

import java.sql.*;
import org.postgresql.ds.PGSimpleDataSource;

public class Connect {
    // public Connection connection() throws SQLException {
    // PGSimpleDataSource cockSource = new PGSimpleDataSource();

    // cockSource.setURL(
    // "jdbc:postgresql://192.168.43.61:4444/defaultdb?sslmode=disable&user=root");
    // // cockSource.setUser("");
    // // cockSource.setPassword("");

    // Connection conect = cockSource.getConnection();
    // return conect;
    // }

    private final String url = "jdbc:mysql://localhost:3306/kadaijin";
    private final String user = "root";
    private final String password = "12174";

    static Connection connect = null;

    public Connection connection() throws SQLException {
        connect = DriverManager.getConnection(url, user, password);
        return connect;
    }

}
