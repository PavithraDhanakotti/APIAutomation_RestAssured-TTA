package com.restassured.MyPractice;

import org.testng.Assert;
import org.testng.IExecutionListener;

public class Lab0007_CustomeListeners  implements IExecutionListener {
    @Override
    public void onExecutionStart() {
        long start = System.currentTimeMillis();
        System.out.printf("***** "+ start + " *****");
    }

    @Override
    public void onExecutionFinish() {
        long end = System.currentTimeMillis();
        System.out.println("*****" + end + " *****");
    }
}
