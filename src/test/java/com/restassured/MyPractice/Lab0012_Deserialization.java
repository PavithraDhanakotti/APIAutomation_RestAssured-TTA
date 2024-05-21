package com.restassured.MyPractice;

import com.google.gson.Gson;
import org.testng.annotations.Test;

public class Lab0012_Deserialization {

    @Test
    public void deserial01() {

        String jsonString = "{\r\n" + "  \"firstName\" : \"Pramod\",\r\n" + "  \"lastName\" : \"Dutta\",\r\n"
                + "  \"gender\" : \"M\",\r\n" + "  \"age\" : 31,\r\n" + "  \"salary\" : 3422.33,\r\n"
                + "  \"married\" : false\r\n" + "}";

        Gson gson = new Gson();
        com.restassured.ClassNotes.misc.gson.example.Employee employeeObject = gson.fromJson(jsonString, com.restassured.ClassNotes.misc.gson.example.Employee.class);

        String firstName = employeeObject.getFirstName();
        String lastName = employeeObject.getLastName();
    }
}
