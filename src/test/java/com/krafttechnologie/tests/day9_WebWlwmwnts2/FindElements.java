package com.krafttechnologie.tests.day9_WebWlwmwnts2;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/components/listgroup");
                List<WebElement> elements = driver.findElements(By.cssSelector(".form-check-input.me-1"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",elements.get(4));

        Thread.sleep(5000);

        for (WebElement element : elements) {
            Assert.assertFalse(element.isSelected());
        }

        for (WebElement element : elements) {
            element.click();
        }

        driver.quit();

    }
}
