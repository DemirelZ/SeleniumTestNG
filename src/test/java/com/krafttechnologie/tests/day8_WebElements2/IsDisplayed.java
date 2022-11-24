package com.krafttechnologie.tests.day8_WebElements2;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IsDisplayed {

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
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        WebElement inputBoxName=driver.findElement(By.cssSelector("#firstName"));

        System.out.println(inputBoxName.isDisplayed());

        //verify inputBox is display

        Assert.assertTrue(inputBoxName.isDisplayed(), "verify is FAILED");
    }
}
