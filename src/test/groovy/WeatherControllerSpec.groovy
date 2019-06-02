package au.com.auspost.auth.api

import au.company.WeatherController
import au.company.service.CitiesManagementService
import spock.lang.Specification
import spock.lang.Subject

class WeatherControllerSpec extends Specification {

    @Subject
    def weatherController

    def citiesManagementService = Mock(CitiesManagementService)


    def setup() {
        weatherController = new WeatherController(citiesManagementService)
    }

    def 'should successfully retrieve temperature per cities'() {
        when:
        def response = weatherController.getTemperaturePerCity();

        then:
        response

        and:
        interaction {
            citiesManagementService.getCities().size() == 7
        }
    }

}
