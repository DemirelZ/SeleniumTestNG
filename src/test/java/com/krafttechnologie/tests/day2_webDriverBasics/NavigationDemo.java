package com.krafttechnologie.tests.day2_webDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.google.com/");

        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);



        driver.navigate().forward();



    }
}
