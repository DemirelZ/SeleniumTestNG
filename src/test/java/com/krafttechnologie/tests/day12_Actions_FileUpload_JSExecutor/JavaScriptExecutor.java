package com.krafttechnologie.tests.day12_Actions_FileUpload_JSExecutor;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    // @AfterMethod
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void clickWithJS() throws InterruptedException {

        /*
        Seleniumda çözemediğimiz bazı sorunlarda JS executer kullanarak çözebiliriz.
        Bu sorunlar neler olabilir?
        Clicking, sendkeys, scroll down or up

        JS Executor bit interface old için new kullanarak bit obje oluşturamıyoruz.
        bu nedenle driver i casting yaparak kullanıyoruz
         */

        driver.get("https://the-internet.herokuapp.com/floating_menu");

        WebElement button= driver.findElement(By.linkText("Elemental Selenium"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", button);
        Thread.sleep(2000);

        String CurrentWindowHandle= driver.getWindowHandle();
        Set<String> windowhandles=driver.getWindowHandles();

        for(String handle: windowhandles){

            if(!handle.equals(CurrentWindowHandle)){
                driver.switchTo().window(handle);


            }

        }
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        String expectedUrl="http://elementalselenium.com/";
        String actualUrl= driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);





    }
    @Test
    public void scrolldeneme(){

        driver.get("https://learn-automation.com/");
        WebElement element = driver.findElement(By.xpath("(//a[@class='bump-view'])[11]"));

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", element);


    }

    @Test
    public void js(){
        driver.get("https://selectorshub.com/xpath-practice-page/");
        WebElement firstName = driver.findElement(By.xpath("(//input[@class='nameFld'])[1]"));
        WebElement lastName = driver.findElement(By.xpath("(//input[@class='nameFld'])[2]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', 'zafer')", firstName);
        js.executeScript("arguments[0].setAttribute('value', 'demir')", lastName);

/*
        JavascriptExecutor js= (JavascriptExecutor) driver;

        String name="Ali";
        String surname="Veli";

        js.executeScript("arguments[0].setAttribute('value', '" + name + "')", firstname);
        js.executeScript("arguments[0].setAttribute('value', '" + surname + "')", lastname);

 */

    }

    @Test
    public void scrollDownAndUp(){

        driver.get("https://www.krafttechnologie.com/");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        js.executeScript("window.scrollBy(0,-3000)");

    }


}
