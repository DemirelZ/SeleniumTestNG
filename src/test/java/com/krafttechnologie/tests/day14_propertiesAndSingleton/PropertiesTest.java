package com.krafttechnologie.tests.day14_propertiesAndSingleton;

import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void testName() {

        String browser= ConfigurationReader.get("browser");
        System.out.println(browser);

        String url=ConfigurationReader.get("url");
        System.out.println(url);
    }

    @Test
    public void openBrowserUsingConfigurationReader() {

        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));

        driver.get(ConfigurationReader.get("url"));

        driver.findElement(By.name("email")).sendKeys(ConfigurationReader.get("userEmail"));



    }
}
