package au.company.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import au.company.model.Cities;
import au.company.model.City;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class CityTemperatureServiceImpl implements CityTemperatureService {
    public static final String WEATHER_RESULTS_PATH = "/build/resources/main/static/weather-results.json";

    private static final Logger LOG = LogManager.getLogger(CityTemperatureServiceImpl.class);

    @Override
    public List<City> getCitiesAndTemperature() {
        Cities cities = new Cities();
        try {
            String canonicalPath = new File(".").getCanonicalPath();
            cities = new ObjectMapper().readValue(new File(canonicalPath + WEATHER_RESULTS_PATH), new TypeReference<Cities>(){});
        } catch (IOException e) {
            LOG.error("Error in retrieving Data." + e.getMessage());
        }
        return cities.getCities();
    }
}
