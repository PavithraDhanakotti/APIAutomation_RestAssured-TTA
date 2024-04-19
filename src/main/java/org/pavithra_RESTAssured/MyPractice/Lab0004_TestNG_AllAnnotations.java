package org.pavithra_RESTAssured.MyPractice;

import org.testng.annotations.*;

public class Lab0004_TestNG_AllAnnotations {


    /**
     *  TestNG Annotations flow goes like this
     *     -> Before Suite, Suite contains all the below also contains multiple tests , class, method and so on
     *     -> Before Test, it also has a unique function that we can run this before anyother testcases to get the response
     *     -> Before Class,
     *     -> Before Method,
     *     -> Before TestCases, for each TC's it run each time with a before method and after method if specified.
     *     -> After Method,
     *     -> After Class,
     *     -> After Test,
     *     -> After Suite.
     */


    @BeforeSuite
    public void TestBeforeSuiteo1(){
        System.out.println("I am The Suite containing all Test,Class,Method and Test Cases and i run first");    }
    @BeforeTest
    public void TestBeforeTest02(){
        System.out.println("I'm the Test contains Class, Method and Test cases and i run second");
    }
    @BeforeClass
    public void TestBeforeClass01(){
        System.out.println("I'm the BeforeClass and can contain multiple methods and testcase under me");
    }
    public void TestBeforeClass02(){
        System.out.println("I'm also a Beforeclass and i come under Before Test");
    }
    @BeforeMethod
    public void TestBeforeMethod01(){
        System.out.println("I'm the BeforeMethod can contain multiple other methods correspondingly and also have a multiple testcase within me");
    }
    @Test
    public void TestCase01(){
        System.out.println("I am the Test case 01");
    }
    @Test
    public void TestCase02(){
        System.out.println("I am the Test case 02");
    }
    @AfterMethod
    public void TestAfterMethod01(){
        System.out.println("I'm the AfterMethod executing after the test cases");

    }
}
