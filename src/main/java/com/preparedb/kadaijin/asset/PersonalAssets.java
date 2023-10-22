package com.preparedb.kadaijin.asset;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonalAssets {

    public String country() throws IOException {

        List<String> countrys = new ArrayList<String>();
        ObjectMapper objectMapper = new ObjectMapper();
        Random random = new Random();

        String path = "country.json";
        File file = new File(path);

        JsonNode data = objectMapper.readTree(file);

        for (JsonNode one : data) {
            countrys.add(one.asText());
        }

        return countrys.get(random.nextInt(420));
    }

    public String city() throws JsonProcessingException, IOException {
        List<String> citys = new ArrayList<String>();
        Random random = new Random();

        String path = "city.json";
        File file = new File(path);

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode json = objectMapper.readTree(file);
        for (JsonNode one : json) {
            citys.add(one.asText());
        }
        return citys.get(random.nextInt(620));
    }
}
