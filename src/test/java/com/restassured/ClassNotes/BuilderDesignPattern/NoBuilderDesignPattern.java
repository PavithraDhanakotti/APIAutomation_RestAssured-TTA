package com.restassured.ClassNotes.BuilderDesignPattern;

public class NoBuilderDesignPattern {

    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        NoBuilderDesignPattern np = new NoBuilderDesignPattern();
        np.step1();
        np.step2();
        np.step3();
    }
}
