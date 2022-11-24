package com.krafttechnologie.tests.day9_WebWlwmwnts2;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownPractice1 {

    /*
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. DropDowns Menusunden SQL,TestNG ve CSS sec

     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() throws InterruptedException {

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

       WebElement ilki= driver.findElement(By.cssSelector("#dropdowm-menu-1"));
        Select select=new Select(ilki);
        select.selectByIndex(3);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("firstSelectedOption.getText() = " + firstSelectedOption.getText());

        WebElement ikinci=driver.findElement(By.cssSelector("#dropdowm-menu-2"));
        Select select2=new Select(ikinci);
        select2.selectByValue("testng");
        WebElement secondSelectedOption1 = select2.getFirstSelectedOption();
        System.out.println("secondSelectedOption1.getText() = " + secondSelectedOption1.getText());

        WebElement ucuncu=driver.findElement(By.cssSelector("#dropdowm-menu-3"));
        Select select3=new Select(ucuncu);
        select3.selectByIndex(1);
        WebElement thirdSelectedOption1 = select3.getFirstSelectedOption();
        System.out.println("thirdSelectedOption1.getText() = " + thirdSelectedOption1.getText());


    }
}
