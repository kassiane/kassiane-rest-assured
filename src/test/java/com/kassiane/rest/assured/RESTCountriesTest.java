package com.kassiane.rest.assured;

import static com.jayway.restassured.RestAssured.get;

import org.junit.Test;

public class RESTCountriesTest {

    @Test
    public void testGetAllCountries() {
        get("http://restcountries.eu/rest/v1/all");
    }
}
