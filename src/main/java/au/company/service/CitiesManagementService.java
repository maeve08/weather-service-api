package au.company.service;

import au.company.model.City;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CitiesManagementService {

    public static final String CITIES_PATH_NAME = "./out/production/static/resources/main/weather-results.json";

    public List<City> getCities() {
        List<City> cities = new ArrayList<>();

        try {
            String canonicalPath = new File(".").getCanonicalPath();

            System.out.print("canonicalPath" + canonicalPath);

//            cities = new ObjectMapper().readValue(new File(canonicalPath + "/build/resources/main/static/weather-results.json"), new TypeReference<List<City>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        City city = new City();
        city.setName("melb");
        city.setTemperature("0.4");
        cities.add(city);
        return cities;
    }
}
