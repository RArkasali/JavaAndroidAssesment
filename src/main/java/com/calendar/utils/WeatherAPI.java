package com.calendar.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class WeatherAPI {
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";

    public static JSONObject getCurrentWeather(String city, String appID) {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();
        Response response = request.queryParam("q", city)
                .queryParam("appid", appID)
                .get("/weather");
        return new JSONObject(response.asString());
    }
}
