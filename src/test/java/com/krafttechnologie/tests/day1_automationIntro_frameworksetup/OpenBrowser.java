package com.krafttechnologie.tests.day1_automationIntro_frameworksetup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) {
        /*
        1. pomxml  e yüklediğimiz webDriver manager kütüphanesinden chromu  hazır hale getirmesini isteyeceğiz
        2. Webdriver class ından driveri hazır hale getirmesini isteyeceğiz
        3. driver atestini yapacağımız web sayfasına bizi götürmesini isteyeceğiz
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.krafttechnologie.com/%22");
                driver.manage().window().maximize();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        String expectedTitle="Kraft Technologie | Yazılım ve Bilişim Eğitimleri – Uzaktan Canlı Eğitim";

        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Baslik bekledigi gibi geldi.Dogrulama gecti");
        }else {
            System.out.println("Baslik beklendigi gibi GELMEDI. Dogrulama GECMEDI");
        }







    }
}
