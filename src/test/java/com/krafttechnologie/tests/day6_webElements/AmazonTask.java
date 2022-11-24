package com.krafttechnologie.tests.day6_webElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTask {
    public static void main(String[] args) {

        /** Class Task
         *  go to the amazon webpage
         *  write "selenium" to search box
         *  verify that the result of the search
         */
        String arananSonuc="java";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement searchBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys(arananSonuc);



        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

        String alınanSonuc=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();

        if(alınanSonuc.contains(arananSonuc)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }



    }
}
