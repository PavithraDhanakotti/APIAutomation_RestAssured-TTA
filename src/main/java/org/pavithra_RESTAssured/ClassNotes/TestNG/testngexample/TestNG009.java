package org.pavithra_RESTAssured.ClassNotes.TestNG.testngexample;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNG009 {

    @Test
    void testCase01(){
        Assert.assertEquals(true,false,"Failed");
        System.out.println("This will not print");
    }
    @Test
    void testCase02(){
        Assert.assertEquals(true,false,"Failed");
        System.out.println("This will not print");
    }
}
