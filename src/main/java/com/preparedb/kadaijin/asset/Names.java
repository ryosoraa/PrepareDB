package com.preparedb.kadaijin.asset;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Names {

    public void name() throws JsonProcessingException, IOException {

        String path = "name.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            String name = data.asText();
            System.out.println(name);

        }

    }

    public static void main(String[] args) throws IOException {
        Names names = new Names();
        names.name();
    }
}
