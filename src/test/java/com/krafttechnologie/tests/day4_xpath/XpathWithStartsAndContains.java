package com.krafttechnologie.tests.day4_xpath;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathWithStartsAndContains {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");
        WebElement searchBox = driver.findElement(By.xpath("//input[starts-with(@class,'desktopOld')]"));

        searchBox.sendKeys("matarama su ko");

        WebElement searcButton= driver.findElement(By.xpath("//div[contains(@class,'SearchBoxOld-cH')]"));
        searcButton.click();

    }
}
