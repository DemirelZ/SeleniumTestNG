package com.krafttechnologie.tests.day6_webElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyThatURLNotChange {
    public static void main(String[] args) {
        /*
        * open the chrome browser
        * got to https://www.krafttechexlab.com/login
        * click on login button
        * verify that url did not changed
         */

        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/login");

        String url1=driver.getCurrentUrl();

        driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();

        String url2=driver.getCurrentUrl();

        if(url1.contains(url2)){
            System.out.println("url did not changed");
        }else {
            System.out.println("url changed");
        }



    }
}
