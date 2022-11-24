package com.krafttechnologie.tests.day18_ExtentReports;

import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WrongUsernameTest extends TestBase {





    @Test
    public void wrongUsername() {

        LoginPages loginPages=new LoginPages();

        extentLogger=report.createTest("wrong userName Test");

        extentLogger.info("Enter wrong username");
        loginPages.userEmailInput_loc.sendKeys("some username");

        extentLogger.info("Enter correct password");
        loginPages.passwordInput_loc.sendKeys(ConfigurationReader.get("password"));

        extentLogger.info("click login button");
        loginPages.submitButton_loc.click();

        String actualMessage = loginPages.warningMessage_loc.getText();

        extentLogger.info("verify that NOT log in");
        Assert.assertEquals(actualMessage,"Email address or password is incorrect. Please check");

        extentLogger.pass("PASSED");



    }


    @Test
    public void wrongUserPassword() {

        LoginPages loginPages=new LoginPages();

        extentLogger=report.createTest("wrong password test");

        BrowserUtils.waitFor(1);

        extentLogger.info("Enter wrong username");
        loginPages.userEmailInput_loc.sendKeys(ConfigurationReader.get("userEmail"));

        extentLogger.info("Enter correct password");
        loginPages.passwordInput_loc.sendKeys("dfgdtgtgh");

        extentLogger.info("click login button");
        loginPages.submitButton_loc.click();

        String actualMessage = loginPages.warningMessage_loc.getText();

        extentLogger.info("verify that NOT log in");
        Assert.assertEquals(actualMessage,"fghrhtyhjtyjtyjtyjEmail address or password is incorrect. Please check");

        extentLogger.pass("PASSED");

    }
}
