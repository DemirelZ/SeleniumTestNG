package com.krafttechnologie.pages;

import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{




    @FindBy(xpath = "//h1[.='Dashboard']")
    public WebElement dashboardPageTitle_loc;

    @FindBy(xpath = "(//span[.='</aFm>'])[1]")
    public WebElement aFmTitle;

    @FindBy(xpath = "//span[@class='d-none d-md-block dropdown-toggle ps-2']")
    public WebElement userPupUp;

    @FindBy(xpath = "(//span[.='My Profile'])[2]")
    public WebElement myProfile;

    @FindBy(xpath = "//a[.='Home']")
    public WebElement homeLink;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut;

    @FindBy(xpath = "//div[@class='copyright']")
    public WebElement copyRight;

    @FindBy(xpath = "//h3[.='isa akyuz']")
    public WebElement usernameLocator;

    @FindBy(xpath = "//span[.='JavaScript']")
    public WebElement tabLocator;

    @FindBy(xpath = "//span[.='Modal']")
    public WebElement moduleLocator;

    ////////////////////////////zafer

    @FindBy(xpath = "//span[.='zafer']")
    public WebElement accountName;

    @FindBy(xpath = "//a[@class='nav-link nav-profile d-flex align-items-center pe-0']")
    public WebElement getUserName;





    public String DashboardPageTitle(){



        String title1=dashboardPageTitle_loc.getText();
        return title1;

    }


    public String usersNames(String name){

        String userNameLocator="//h3[.='"+name+"']";

        BrowserUtils.waitForPresenceOfElement(By.xpath(userNameLocator),5);

        WebElement UserName= Driver.get().findElement(By.xpath(userNameLocator));

        String actualName= UserName.getText();

        return actualName;

    }
    public String getUserName(){

        BrowserUtils.waitForVisibility(getUserName,5);

        return getUserName.getText();
    }

}
