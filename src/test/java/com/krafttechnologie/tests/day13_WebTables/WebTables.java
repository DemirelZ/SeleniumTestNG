package com.krafttechnologie.tests.day13_WebTables;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    // @AfterMethod
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void printtable(){


        driver.get("https://webdriveruniversity.com/Data-Table/index.html");
        WebElement table= driver.findElement(By.xpath("//table[@class='table table-light traversal-table']"));
        System.out.println("table.getText() = " + table.getText());

    }
    @Test
    public void printAllHeadres() {


        driver.get("https://webdriveruniversity.com/Data-Table/index.html");
        WebElement tableAllHead= driver.findElement(By.xpath("//table[@class='table table-light traversal-table']/thead"));
        System.out.println("tableAllHead.getText() = " + tableAllHead.getText());


    }
    @Test
    public void printAllHeadSize() {


        driver.get("https://webdriveruniversity.com/Data-Table/index.html");
        List<WebElement> tableAllHeadSize = driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//th"));
        System.out.println("tableAllHeadSize.size() = " + tableAllHeadSize.size());

        for (WebElement webElement : tableAllHeadSize) {
            System.out.println(webElement.getText());
        }

        List<WebElement> elements = driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//tr"));
        System.out.println(elements.size());


    }
    @Test
    public void getRow() {


        driver.get("https://webdriveruniversity.com/Data-Table/index.html");
        WebElement row2 = driver.findElement(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr[2]"));

        System.out.println("row2.getText() = " + row2.getText());
    }
    @Test
    public void getAllRows() {


        driver.get("https://webdriveruniversity.com/Data-Table/index.html");
        List<WebElement> allRow=driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr"));

        for (int i = 0; i <= allRow.size(); i++) {
             WebElement row= driver.findElement(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr["+i+"]"));
            System.out.println(row.getText());

        }


    }
    @Test
    public void getAllCellsOneRow() {


        driver.get("https://webdriveruniversity.com/Data-Table/index.html");

        WebElement scott=driver.findElement(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr[3]//td[2]"));
        System.out.println(scott.getText());




    }
    @Test
    public void frameOrnek() {


        driver.get("https://www.krafttechexlab.com/components/iframe");

        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("(//button[@class='btn-close btn-close-white'])[1]")).click();
        driver.switchTo().defaultContent();
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }





}
