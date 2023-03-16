package com.krafttechnologie.tests.day16_POM1;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTests extends TestBase {

    LoginPages loginPages=new LoginPages();
    DashboardPage dashboardPage=new DashboardPage();

    @Test
    public void navigateToTabAndModule() throws InterruptedException {

        loginPages.loginUser_met();
        dashboardPage.navigateToModule("Components","Charts");

        String actualSubTitle = dashboardPage.subTitle("Charts");

        Assert.assertEquals(actualSubTitle,"Charts");

        Thread.sleep(3000);

    }

    @Test
    public void getUser(){
        loginPages.loginUser_met();

        String actulaUser = dashboardPage.usersNames("Jhon Nash");

        String expectedUser="Jhon Nash";

        Assert.assertEquals(actulaUser, expectedUser);

    }

    @Test
    public void myPorfile(){

        loginPages.loginUser_met();
        dashboardPage.myProfile.click();
    }

    @Test
    public void aFmTitle(){

        loginPages.loginUser_met();
        String aFmTitle = dashboardPage.aFmTitle.getText();
        System.out.println("aFmTitle = " + aFmTitle);

    }

    @Test
    public void coptRight(){
        loginPages.loginUser_met();
        String copyRightText = dashboardPage.copyRight.getText();
        System.out.println("copyRightText = " + copyRightText);

    }

}
