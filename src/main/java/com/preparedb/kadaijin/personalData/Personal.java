package com.preparedb.kadaijin.personalData;

public class Personal {
    public String [] data(String name) {
        List<String> name = new ArrayList<>();
        String [] country = [""];
        String [] city = [""];
        Integer age = random;
    }

    public List<String> personalDB (Connection connection) {
        String path = "country.json";
        List<String> countrys = new ArrayList<String>();

        ObjectMapper objectMapper = new ObjectMapper;
        File file = new File(path);

        JsonNode data = objectMapper.readTree("file");

        for (JsonNode one : data) {
            String country = one.asText;
            countrys.add(one.asText);
            System.out.println(country);
        }

        return countrys;
    }
}
