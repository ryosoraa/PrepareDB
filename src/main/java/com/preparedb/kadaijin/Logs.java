package com.preparedb.kadaijin;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

import com.preparedb.kadaijin.service.Connect;
import com.preparedb.kadaijin.service.LogsInsert;

public class Logs {
    public static void main(String[] args) throws SQLException {
        Connect connect = new Connect();
        Connection connection = connect.connection();
        Random random = new Random();

        Integer user_id = 1;

        while (user_id <= 24495) {
            Integer loop = random.nextInt(10);
            System.out.println(user_id);
            while (loop > 1) {
                LogsInsert.logs(connection, user_id);
                loop--;
            }
            user_id++;
        }

    }
}
