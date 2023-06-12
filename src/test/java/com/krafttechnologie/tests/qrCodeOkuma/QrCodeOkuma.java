package com.krafttechnologie.tests.qrCodeOkuma;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class QrCodeOkuma {

    @Test
    public void qrCodeTest() throws IOException, NotFoundException {
        String urlText="https://www.google.com/";
        Driver.get().findElement(By.xpath("//textarea[@id='qrcode-field-text-text']")).sendKeys(urlText);
        BrowserUtils.waitFor(3);
        String qrCodeUrl = Driver.get().findElement(By.xpath("//img[@id='qrcode-preview-image']")).getAttribute("src");

        URL url = new URL(qrCodeUrl);

        BufferedImage bufferedImage = ImageIO.read(url);

        LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));

        Result result = new MultiFormatReader().decode(binaryBitmap);
        String textResult = result.getText();

        System.out.println("textResult = " + textResult);
        Driver.get().get(textResult);
        Assert.assertEquals(Driver.get().getCurrentUrl(),urlText,"QR code control");
    }

    @Test
    public void QRTest(){



        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.barcode-generator.org/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//h1//div[@id='code_selector_chosen']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        BrowserUtils.waitFor(2);
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", element);

        System.out.println(driver.findElement(By.cssSelector("#code_selector_chosen>a>span")).getText());
        BrowserUtils.waitFor(2);


        /*
        WebElement element = driver.findElement(By.cssSelector("#code_selector_chosen"));
        Select slectMenu=new Select(element);
        List<WebElement> options = slectMenu.getOptions();
        System.out.println(options);
        System.out.println(options.size());
        System.out.println(options.get(2));
        System.out.println(options.get(2).getText());
        System.out.println(options.get(1).getAttribute("value"));*/




    }

}
