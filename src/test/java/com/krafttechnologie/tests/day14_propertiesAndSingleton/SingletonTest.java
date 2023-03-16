package com.krafttechnologie.tests.day14_propertiesAndSingleton;

import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {
    @Test
    public void test1() {

        String s1=Singleton.getInstance();
        String s2=Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);

    }


    @Test
    public void test2() {

       // WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver driver = Driver.get();

        driver.get(ConfigurationReader.get("url"));


    }

    @Test
    public void test3() {



    }

    @Test
    public void test4() {

    }
}
