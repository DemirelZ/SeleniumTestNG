package com.krafttechnologie.tests.day5_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssWithClass {
    private static WebDriver driver;

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://www.krafttechexlab.com/");

        String x = driver.findElement(By.cssSelector("div[class='row']>div[class='col-md-4']")).getText();
        System.out.println(x);





    }


}
