package com.restassured.MyPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Lab0007_CustomeListeners.class)
public class Lab0006_Listeners {


    @Test
    public void ok(){
        System.out.println("Hello");
        Assert.assertTrue(true);
    }

    @Test
    public void OKK(){
        System.out.println("Hi");
        Assert.assertTrue(false);
    }
}
