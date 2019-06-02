package au.company.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Cities {
    private List<City> cities;

    @JsonProperty("cities")
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
