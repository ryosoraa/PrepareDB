package com.preparedb.kadaijin.asset;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NamesAssets {

    public List<String> names() throws JsonProcessingException, IOException {
        List<String> name = new ArrayList<>();
        String path = "name.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode read = objectMapper.readTree(file);

        for (JsonNode data : read) {
            name.add(data.asText());
        }

        return name;

    }

}
