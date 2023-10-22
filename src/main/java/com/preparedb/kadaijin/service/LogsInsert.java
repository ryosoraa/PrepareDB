package com.preparedb.kadaijin.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogsInsert {

    public static void logs(Connection connection, Integer id) throws SQLException {

        String query = String.format("INSERT INTO logs (user_id) VALUES (%d);", id);

        PreparedStatement preparedStatement = null;

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();
    }

}
