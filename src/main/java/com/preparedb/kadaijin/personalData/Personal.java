package com.preparedb.kadaijin.personalData;

public class Personal {
    public String [] data(String name) {
        List<String> name = new ArrayList<>();
        String [] country = [""];
        String [] city = [""];
        Integer age = random;
    }

    public void personalDB (Connection connection) {
        String path = "country.json";

        ObjectMapper objectMapper = new ObjectMapper;
        File file = new File(path);

        JsonNode data = objectMapper.readTree("file");

        for (JsonNode one : data) {
            String country = one.asText;
            System.out.println(country);
        }
    }
}
