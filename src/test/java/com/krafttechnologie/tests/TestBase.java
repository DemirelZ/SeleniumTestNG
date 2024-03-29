package com.krafttechnologie.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    //extent report
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;


    @BeforeTest
    public void setUpTest(){

        //initialize the class
        report =new ExtentReports();

        //create a report path
        String projectPath=System.getProperty("user.dir");
        String reportPath=projectPath + "/test-output/report.html";
        //String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());   ---> çoklu rapor almak istediğimizde bu iki satırı kullanabiliriz
        //String reportPath=projectPath + "/test-output/report"+date+".html";

        //initialize the html report the reportPath
        htmlReporter=new ExtentHtmlReporter(reportPath);

        //attach the html report to the report object
        report.attachReporter(htmlReporter);

        //title in report
        htmlReporter.config().setReportName("KraftTechB2 Smoke Test");

        //set environment information
        report.setSystemInfo("Environment","Production");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));     //testi hangi sistemde çalıştığı ile ilgili
        report.setSystemInfo("Test Engineer", "ZAFER");


    }

    @AfterTest
    public void tearDownTest(){

        report.flush();


    }

    @BeforeMethod
    public void setUp() {
        driver = Driver.get();
        driver.get(ConfigurationReader.get("url"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(Driver.get(), 15);
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException, IOException {

        //If Test Fails
        if(result.getStatus()==ITestResult.FAILURE){

            //Record the name of failed test
            extentLogger.fail(result.getName());

            //Take the screenshot and return the location of screenshot
            String screenShotPath=BrowserUtils.getScreenshot(result.getName());

            //Add the screenShot to the report
            extentLogger.addScreenCaptureFromPath(screenShotPath);

            //Capture the exception and put inside report
            extentLogger.fail(result.getThrowable());

        }


        Thread.sleep(3000);
        //driver.quit();
        Driver.closeDriver();




    }
}
