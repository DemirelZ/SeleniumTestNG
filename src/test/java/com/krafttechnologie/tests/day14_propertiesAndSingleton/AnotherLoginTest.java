package com.krafttechnologie.tests.day14_propertiesAndSingleton;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AnotherLoginTest extends TestBase {


    @Test
    public void testName() {

        driver.get(ConfigurationReader.get("url"));

       // Driver.get().get(ConfigurationReader.get("url"));

        driver.findElement(By.name("email"))
                .sendKeys(ConfigurationReader.get("userEmail"));
        driver.findElement(By.name("password"))
                .sendKeys(ConfigurationReader.get("password") + Keys.ENTER);


    }
}
