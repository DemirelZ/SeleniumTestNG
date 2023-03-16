package com.krafttechnologie.tests.qrCodeOkuma;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

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

}
