package com.kassiane.rest.assured;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class RESTCountriesTest {

    @Test
    public void getAllCountriesSuccessfully() {
        final List<String> countryNames = when().get("http://restcountries.eu/rest/v1/all").jsonPath().getList("name");
        assertThat(countryNames.size(), greaterThanOrEqualTo(247));
    }
}
