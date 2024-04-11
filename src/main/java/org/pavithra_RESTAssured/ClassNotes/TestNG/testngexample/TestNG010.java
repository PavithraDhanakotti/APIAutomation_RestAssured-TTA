package org.pavithra_RESTAssured.ClassNotes.TestNG.testngexample;
import org.testng.annotations.Test;
public class TestNG010 {
    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
    }

}
