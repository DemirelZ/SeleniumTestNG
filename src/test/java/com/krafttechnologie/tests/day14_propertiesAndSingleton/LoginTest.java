package com.krafttechnologie.tests.day14_propertiesAndSingleton;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPages loginPages=new LoginPages();
    DashboardPage dashboardPage=new DashboardPage();


    @Test
    public void openBrowserUsingConfigurationReader() {



        driver.get(ConfigurationReader.get("url"));

        driver.findElement(By.name("email")).sendKeys(ConfigurationReader.get("userEmail"));



    }

    @Test
    public void LoginWithMetot(){

        loginPages.loginUser_met();

        String actualTitle=dashboardPage.DashboardPageTitle();
        String expected="Dashboard";

        Assert.assertEquals(actualTitle,expected);

    }




}
