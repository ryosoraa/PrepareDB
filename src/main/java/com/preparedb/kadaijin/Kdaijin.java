package com.preparedb.kadaijin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.preparedb.kadaijin.service.Connect;
import com.preparedb.kadaijin.service.Insert;

public class Kdaijin {
    public static void main(String[] args)
            throws JsonProcessingException, IOException, InterruptedException, SQLException {

        Connect connect = new Connect();
        Connection connection = connect.connection();
        Insert.name(connection);

        if (connection != null) {
            connection.close();
        }
    }
}
