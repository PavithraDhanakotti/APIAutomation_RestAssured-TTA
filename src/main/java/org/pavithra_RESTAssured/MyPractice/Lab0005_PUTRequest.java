package org.pavithra_RESTAssured.MyPractice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class Lab0005_PUTRequest {
    /*
    RESTful Booker - PUT Request in Non BDD Style
    -> Before (Given) - Payload, Get Booking ID, path, url ----- AKa Request Specification
    -> During (When) - Change ----- AKa Response
    -> After (Then) - Update ----- AKa Validate Response
     */

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token;

    @BeforeTest
    public void gettoken(){
        requestSpecification = RestAssured.given();
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);

        Response response = requestSpecification.post();
        validatableResponse = response.then();

        validatableResponse.body("token", Matchers.notNullValue());

        token = response.then().log().all().extract().path("token");
        Assert.assertNotNull(token);

        assertThat(token).isNotBlank().isNotNull().isNotEmpty();
        System.out.println(token);


    }

    @Test
    public void NonBDDPUTreq() {
        String jsonstring = "{\n" +
                "    \"firstname\": \"Pavithra\",\n" +
                "    \"lastname\": \"Dhanakotti\",\n" +
                "    \"totalprice\": 11,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2018-02-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/4549");
        requestSpecification.body(jsonstring);

        Response response = requestSpecification.put();
        System.out.println(response.asString());

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        validatableResponse.body("firstname", Matchers.equalTo("Pavithra"));
        validatableResponse.body("lastname",Matchers.equalTo("Dhanakotti"));
    }

}
