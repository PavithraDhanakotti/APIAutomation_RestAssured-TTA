package org.pavithra_RESTAssured.MyPractice;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab0003_GET_NonBDD {
    @Test
    public void getallbookingidnegative(){
        RequestSpecification req = RestAssured.given();
                req.baseUri("https://restful-booker.herokuapp.com");
                req.basePath("/booking/856").log().all();
                req.when().get();
                req.then().log().all().statusCode(404);
    }
}
