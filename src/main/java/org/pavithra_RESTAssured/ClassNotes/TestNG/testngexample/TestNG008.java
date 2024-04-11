package org.pavithra_RESTAssured.ClassNotes.TestNG.testngexample;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG008 {

    @Test
    void testCase01(){
        // Assertion -  AR == ER
        // Two Types Assertions
        // Soft Assertion

        // Expected Result - pramod
        // Actual Result - Response? - pramod

//        SoftAssert s = new SoftAssert();
//        s.assertEquals(true,false,"True should not be equal to False");
//        System.out.println("Please execute me");
//        s.assertAll();

        // token-  not fail no, BasicAuth()







        // Hard Assertion
        Assert.assertEquals(true,false,"Failed");
        System.out.println("This will not print");

    }
}
