package com.krafttechnologie.tests.day8_WebElements2;

import com.krafttechnologie.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetAttribute {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test(){
        driver.get("https://demoqa.com/radio-button");
                WebElement yseBtn=driver.findElement(By.cssSelector("#yesRadio"));

        System.out.println("yseBtn.getAttribute(type) = " + yseBtn.getAttribute("type"));
        System.out.println("yseBtn.getAttribute(name) = " + yseBtn.getAttribute("name"));
    }
}
