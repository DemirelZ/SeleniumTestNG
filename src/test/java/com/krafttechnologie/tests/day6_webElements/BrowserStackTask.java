package com.krafttechnologie.tests.day6_webElements;

import com.github.javafaker.Faker;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserStackTask {
    public static void main(String[] args) {

/** Class Task
 *  go to the url -  "https://www.browserstack.com/users/sign_up"
 *  maximize the window
 *  accept cookies if any ,
 *  fill in the blanks with the faker class
 *  click "Term of service" checkbox
 *  and close the window
 *
 *  hint: u can use any locator you want
 *
 */
        Faker faker=new Faker();
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.browserstack.com/users/sign_up");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#accept-cookie-notification")).click();
        WebElement fullNameBox=driver.findElement(By.cssSelector("#bs-auth-input-fullname"));
        fullNameBox.sendKeys(faker.name().firstName());
        WebElement businesEmailBox = driver.findElement(By.cssSelector("#bs-auth-input-email"));
        businesEmailBox.sendKeys(faker.internet().emailAddress());
        WebElement passwordBox = driver.findElement(By.cssSelector("#bs-auth-input-password"));
        passwordBox.sendKeys(faker.internet().password());
        driver.findElement(By.cssSelector("#tnc_checkbox")).click();
        driver.quit();



    }
}
