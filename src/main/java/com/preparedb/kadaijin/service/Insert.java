package com.preparedb.kadaijin.service;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Insert {

    public static void query(Connection connection, String name) throws SQLException {

        String query = String.format("insert into accounts(username,password) values ('%s, '%s');",
                name.concat("@gmail.com'"), name);

        PreparedStatement preparedStatement;

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();
    }

    public static void name(Connection connection)
            throws JsonProcessingException, IOException, InterruptedException, SQLException {

        String path = "name.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            String name = data.asText();
            System.out.println(name.concat("@gmail.com"));

            Insert.query(connection, name);

        }

    }
}
