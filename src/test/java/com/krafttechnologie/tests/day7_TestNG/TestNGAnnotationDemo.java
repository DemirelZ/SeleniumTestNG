package com.krafttechnologie.tests.day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo {

    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");
    }

    @Test
    public void test1(){
        System.out.println("first test first assertion");
        Assert.assertEquals("title ", "title");

        System.out.println("first test Second Assertion");
        Assert.assertEquals("url","url");

    }

    @Test
    public void test2(){
        System.out.println("second test first assertion");
        Assert.assertEquals("test2","test2");
    }
@Test
    public void test3(){
        String expectedTitle="Kraft";
        String actulaTitle="KraftTrch";

        Assert.assertTrue(actulaTitle.contains(expectedTitle), "dikkat!");


    }


    @AfterMethod
    public void teardown(){
        System.out.println("Close browser");
    }



}
