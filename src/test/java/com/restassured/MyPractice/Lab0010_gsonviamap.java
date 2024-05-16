package com.restassured.MyPractice;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab0010_gsonviamap {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

    @Test
    public void test01(){

//        Payload data =
        //{
        //            "firstname" : "Jim",
        //                "lastname" : "Brown",
        //                "totalprice" : 111,
        //                "depositpaid" : true,
        //                "bookingdates" : {
        //            "checkin" : "2018-01-01",
        //                    "checkout" : "2019-01-01"
        //        },
        //            "additionalneeds" : "Breakfast"
        //        }

   // Managae via map

        Map<String,Object> jsonusingmap = new LinkedHashMap<>();
        Faker fake = new Faker();
        String name = fake.name().firstName();

        jsonusingmap.put("firstname", fake.name().firstName());
        jsonusingmap.put("lastname", fake.name().lastName());
        jsonusingmap.put("totalprice", fake.random().nextInt(2000));
        jsonusingmap.put("depositpaid", fake.random().nextBoolean());

        Map<String,Object> bookingdates = new LinkedHashMap<>();
        bookingdates.put("checkin","2018-01-01");
        bookingdates.put("checkout","2019-01-01");

        jsonusingmap.put("bookingdates", bookingdates);
        jsonusingmap.put("additionalneeds", "Lunch");

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonusingmap).log().all();

        Response response = requestSpecification.when().post();
        Integer bookingId = response.then().extract().path("bookingid");

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        System.out.println("Your Booking Id is  "+ bookingId);





    }

}
