package com.preparedb.kadaijin.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonalInsert {
    public void insert(Connection connection,
            String name,
            Integer age,
            Integer phone,
            String country,
            String city,
            Integer accounts_id) throws SQLException {

        String query = String.format(
                "INSERT INTO personal_data (name,age,phone,country,city,accounts_id) VALUES ('%s',%d,%d,'%s','%s',%d);",
                name, age, phone, country, city, accounts_id);

        PreparedStatement preparedb;

        preparedb = connection.prepareStatement(query);
        preparedb.executeUpdate();
    }
}
