package com.krafttechnologie.tests.day7_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    @Test
    public void te1(){
        System.out.println("first test case");
    }
    @Test
    public void test1(){
        System.out.println("second test");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before metot");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("after metot");
    }

    @Test
    public void t1(){
        System.out.println("third test");
    }



}
