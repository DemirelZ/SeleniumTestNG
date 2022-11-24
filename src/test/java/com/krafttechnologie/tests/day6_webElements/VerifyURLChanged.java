package com.krafttechnologie.tests.day6_webElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {
    public static void main(String[] args) {

        /*
        * open chrome browser
         *          go to https://www.krafttechexlab.com/login
         *         enter email as mike@gmail.com
         *         enter password as 12345
         *         click login btn
         *         verify that Url has changed
         */

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        WebElement emailBox=driver.findElement(By.xpath("//input[@id='email']"));
        emailBox.sendKeys("mike@gmail.com");

        WebElement passBox=driver.findElement(By.xpath("//input[@id='yourPassword']"));
        passBox.sendKeys("12345");

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
