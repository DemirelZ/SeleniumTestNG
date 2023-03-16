package com.krafttechnologie.tests.day12_Actions_FileUpload_JSExecutor;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {

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
    public void fileUpload(){
        driver.get("https://demoqa.com/upload-download");
        WebElement chooseFile = driver.findElement(By.id("uploadFile"));
        chooseFile.sendKeys("C:\\Users\\Lenovo\\Desktop\\multipleTabs.docx");




    }

    @Test
    public void testUploadFileNot() {

        /*
        testfolder üzerinde sağ click Directory sec+ resources sec
        file copy et resources uzerine uzantısı txt olacak paste yap
        sonra projenin sistemindeki path ini alıyoruz:
        --> String projectPAth= System.getProperty("user.dir");

        File nin pathi ise:
        --> String filePath= "src/test/resources/denemetext.txt";

         */



        String projectPath1= System.getProperty("user.dir");
        String filePath1= "src/test/resources/denemetext.txt";

        //iki pathi bir araya getiriyoruz:
        String fullPath1= projectPath1+"/"+ filePath1;


        ////////////////////////////////////////////////////////////////////////////
        /////////////hocanın yazdığı not//////////////////////////////

        /*
        test folder uzerinde sag clcik Directory sec+ resources sec
        file copy et resources uzerne uzantisi .txt olacak sekilde paste yap
        Sonra projenin sistemdeki path ini aliyoruz:
        String projectPath= System.getProperty("user.dir");

        String FilePath= "src/test/resources/Deneme Text.txt"
         */
        driver.get("https://demoqa.com/upload-download");

                WebElement chooseFile= driver.findElement(By.id("uploadFile"));

        String projectPath= System.getProperty("user.dir");
        String FilePath= "src/test/resources/denemetext.txt";

        String fullPath= projectPath+"/"+FilePath;

        chooseFile.sendKeys(fullPath);

        WebElement testmsj= driver.findElement(By.cssSelector("#uploadedFilePath"));

        System.out.println("testmsj = " + testmsj.getText());

        String actual= testmsj.getText();
        String expected="denemetext.txt";

        Assert.assertTrue(actual.contains(expected));



    }
}
