package com.krafttechnologie.tests.day15_POM;

import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {

    LoginPages loginPages=new LoginPages();

    @Test
    public void wrongPassword() {

        driver.get(ConfigurationReader.get("url"));



        loginPages.userEmailInput_loc.sendKeys(ConfigurationReader.get("userEmail"));
        loginPages.passwordInput_loc.sendKeys("jhjghygy");
        loginPages.submitButton_loc.click();






//        WebElement usernameInput = driver.findElement(By.name("email"));
//        WebElement passwordInput = driver.findElement(By.name("password"));
//
//        usernameInput.sendKeys(ConfigurationReader.get("username"));
//        passwordInput.sendKeys("some password");
//
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        WebElement warningMessage = driver.findElement
//                (By.xpath("//*[contains(text(),'Email address or password is incorrect. Please check')]"));
//
//        Assert.assertEquals(warningMessage.getText(),
//                "Email address or password is incorrect. Please check",
//                "Verify that user is NOT login");

    }

    @Test
    public void wrongUsername() {

        driver.get(ConfigurationReader.get("url"));

        loginPages.userEmailInput_loc.sendKeys("hjgjygyjg");
        loginPages.passwordInput_loc.sendKeys(ConfigurationReader.get("password"));
        loginPages.submitButton_loc.click();

        String actulaMessage=loginPages.warningMessage_loc.getText();
        String expectedMessage="Email address or password is incorrect. Please check";

        Assert.assertEquals(actulaMessage,expectedMessage);








    }
}
