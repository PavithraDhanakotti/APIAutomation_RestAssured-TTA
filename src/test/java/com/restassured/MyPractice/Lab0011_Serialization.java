package com.restassured.MyPractice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.restassured.ClassNotes.misc.gson.example.Employee;
import org.testng.annotations.Test;

public class Lab0011_Serialization {

    @Test
    public void Sertest01(){
        Employee emp = new Employee();
        emp.setFirstName("Pavithra");
        emp.setLastName("D");
        emp.setGender("Female");
        emp.setAge(22);
        emp.setSalary(52000.00);
        emp.setMarried(false);

        // Convert from java object to stram bytes(JSON)
        // Step -1 = Create a gson

        Gson gson = new Gson();
        String ConvertedData = gson.toJson(emp);
        System.out.println(ConvertedData);


        // Print in a JSON format

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String gsoninjsonformat = gsonBuilder.toJson(emp);
        System.out.println(gsoninjsonformat);
    }


}
