package com.krafttechnologie.tests.day12_Actions_FileUpload_JSExecutor;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Actions1 {

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
    public void doubleClick(){

        // Action Class ileri düzey etkileşimler sunar.
        //doubleclick, dragggAndDropp, hover, rightClick .. vb
        // Action Class Seleniımdan gelir. WebDriver constructor gibi parametre olarak atanır
        //Cunku driveri browserla etkilesime gecebilmesi icin
        //perform() ----> action tamamlamak için kullanılır


        driver.get("https://webdriveruniversity.com/Actions/index.html");
        WebElement ciftTıkla= driver.findElement(By.id("double-click"));
        Actions actions=new Actions(driver);
        actions.doubleClick(ciftTıkla).perform();
            }

            @Test
    public void draganddropp(){
                driver.get("https://webdriveruniversity.com/Actions/index.html");
                WebElement draggable = driver.findElement(By.id("draggable"));
                WebElement droppable = driver.findElement(By.id("droppable"));
                Actions actions=new Actions(driver);
                actions.dragAndDrop(draggable,droppable).perform();
            }
    @Test
    public void task1(){
        driver.get("https://www.krafttechexlab.com/javascript/droppable");

        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(draggable,droppable).perform();

        WebElement element = driver.findElement(By.xpath("//p[text()='Dropped!']"));

        Assert.assertEquals(element.getText(),"Dropped!");
    }
    @Test
    public void hover1() throws InterruptedException {

        driver.get("https://webdriveruniversity.com/Actions/index.html");
        WebElement hoverME = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        WebElement link1 = driver.findElement(By.xpath("(//a[.='Link 1'])[1]"));

        Actions actions=new Actions(driver);
        actions.moveToElement(hoverME).perform();
        Thread.sleep(3000);

        Assert.assertTrue(link1.isDisplayed());

        link1.click();

        Alert alert=driver.switchTo().alert();
        String OnAlert = alert.getText();
        String actualText=OnAlert;
        String expectedText="Well done you clicked on the link!";

        Assert.assertEquals(actualText,expectedText);

        alert.accept();


    }
    @Test
    public void hover2() throws InterruptedException {

        driver.get("https://www.krafttechexlab.com/components/tooltips");
        WebElement onTop = driver.findElement(By.xpath("((//div[@class=\"card-body\"])[1]/button)[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(onTop).perform();
        String actulatext = onTop.getAttribute("data-bs-placement");
        String expected = "top";


        Assert.assertEquals(actulatext, expected);
        List<WebElement> hovers= driver.findElements(By.xpath("//button[@class='btn btn-secondary']"));

        for(WebElement hover: hovers){
            actions.moveToElement(hover).pause(2000).perform();
        }




    }
    @Test
    public void rightClick() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

        Actions actions=new Actions(driver);
        actions.contextClick(rightClickBtn).perform();
        Thread.sleep(2000);
        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String expected="You have done a right click";
        Assert.assertEquals(rightClickMessage.getText(),expected);

    }





}
