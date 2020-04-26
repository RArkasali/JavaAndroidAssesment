package com.calendar.test.steps;

import com.calendar.pages.WeatherToday;
import com.calendar.utils.AssertHelper;
import com.calendar.utils.ReadPropertiesFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

public class AHappyHolidayMakerSteps{
    private WeatherToday  weather;
    private static final Logger LOG = Logger.getLogger(ReadPropertiesFile.class);

    @Given("^I like to holiday in (.*)$")
    public void userAccessedApp(String city) {
        weather = new WeatherToday();
    }

    @And("^I look up the weather forecast today (.*)$")
    public void iLookUpTheWeatherForecastTodayCity(String city) {
        weather.getCurrentWeather(city);
    }

    @When("^I receive the weather forecast$")
    public void receiveTheWeatherForecast(){
        LOG.info("Weather is " + weather.getDegree());
    }

    @And("^the temperature is warmer than (.*) degrees$")
    public void theTemperatureIsWarmerThanDegreeDegrees(float degree) {
        boolean warner = weather.getDegree() > degree;
        AssertHelper.assertTrue(warner);
    }
}
