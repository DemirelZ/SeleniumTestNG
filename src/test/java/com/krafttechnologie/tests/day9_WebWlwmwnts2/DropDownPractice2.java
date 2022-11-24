package com.krafttechnologie.tests.day9_WebWlwmwnts2;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownPractice2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

   // @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() throws InterruptedException {

        /*
          1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
           2. Checkboxes kutusundan sadece option 1  ve 4 u sec
         */

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        driver.findElement(By.xpath("//input[@value='option-1']")).click();
        driver.findElement(By.xpath("//input[@value='option-3']")).click();
        driver.findElement(By.xpath("//input[@value='option-4']")).click();







    }

}
