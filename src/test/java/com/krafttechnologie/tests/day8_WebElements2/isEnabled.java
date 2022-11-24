package com.krafttechnologie.tests.day8_WebElements2;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class isEnabled {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test(){
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBox= driver.findElement(By.cssSelector("#gridCheck2"));

        System.out.println(checkBox.isEnabled());

        Assert.assertTrue(checkBox.isEnabled());
    }
    @Test
    public void radioTest(){
        driver.get("https://www.krafttechexlab.com/forms/radio");
        WebElement radioBox1= driver.findElement(By.cssSelector("#gridRadios1"));
        WebElement radioBox2= driver.findElement(By.cssSelector("#gridRadios2"));



        System.out.println(radioBox1.isSelected());
        System.out.println(radioBox2.isSelected());


        Assert.assertTrue(radioBox1.isSelected());
        Assert.assertFalse(radioBox2.isSelected());

        radioBox2.click();

        Assert.assertFalse(radioBox1.isSelected());
        Assert.assertTrue(radioBox2.isSelected());


    }
}
