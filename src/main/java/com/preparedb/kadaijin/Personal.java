package com.preparedb.kadaijin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.preparedb.kadaijin.asset.AgeAndPhone;
import com.preparedb.kadaijin.asset.NamesAssets;
import com.preparedb.kadaijin.asset.PersonalAssets;
import com.preparedb.kadaijin.service.Connect;
import com.preparedb.kadaijin.service.PersonalInsert;

public class Personal {
    public static void main(String[] args)
            throws JsonProcessingException, IOException, SQLException, InterruptedException {
        PersonalAssets personalAssets = new PersonalAssets();
        PersonalInsert personalInsert = new PersonalInsert();

        AgeAndPhone ageAndPhone = new AgeAndPhone();
        NamesAssets namesAssets = new NamesAssets();
        Connect connect = new Connect();

        Connection connection = connect.connection();

        Integer user_id = 2;

        for (String name : namesAssets.names()) {
            personalInsert.insert(
                    connection,
                    name,
                    ageAndPhone.age(),
                    ageAndPhone.phone(),
                    personalAssets.country(),
                    personalAssets.city(),
                    user_id);
            user_id++;
            System.out.println(name);
            // Thread.sleep(200);
        }
    }
}
