package com.krafttechnologie.tests.day8_WebElements2;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() {
        driver.get("https://www.krafttechexlab.com/javascript/clicks");
        List<WebElement> buttons = driver.findElements(By.xpath("//button[@class='btn btn-primary']"));
        System.out.println("buttons.size() = " + buttons.size());
        Assert.assertEquals(4, buttons.size());
        for (WebElement button : buttons) {
            System.out.println("button.getText() = " + button.getText());
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
        }


    }

}
