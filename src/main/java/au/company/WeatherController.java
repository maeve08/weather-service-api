package au.company;

import au.company.model.City;
import au.company.service.CityTemperatureService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class WeatherController {

    private final CityTemperatureService cityTemperatureService;

    public WeatherController(CityTemperatureService cityTemperatureService) {
        this.cityTemperatureService = cityTemperatureService;
    }

    @CrossOrigin
    @RequestMapping("/temperature/city")
    public List<City> getTemperaturePerCity() {
        return cityTemperatureService.getCitiesAndTemperature();
    }
}
