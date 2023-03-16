package com.krafttechnologie.tests.day19_reviewAndXmlRunner;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.pages.ProfilePage;
import com.krafttechnologie.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyUserInfo extends TestBase {

    /** Class Task
     * go to https://www.krafttechexlab.com/login web site
     * Login as a user
     * Verify that login is successful with account name
     * Click on My profile
     * Click on Edit Profile
     * Verify that email value
     * navigate back
     * Verify that Dashboard page with url
     *
     */

    @Test
    public void test1() {

        LoginPages loginPages=new LoginPages();
        DashboardPage dashboardPage=new DashboardPage();
        ProfilePage profilePage=new ProfilePage();

        extentLogger=report.createTest(" Edit Profile Test ");

        extentLogger.info("Login Dashboard");
        loginPages.loginUser_met();

        extentLogger.info("Verify that log in");
        String accountActualName = dashboardPage.accountName.getText();
        String expectedName="zafer";
        Assert.assertEquals(accountActualName,expectedName);

        extentLogger.info("click my profile");
        dashboardPage.myProfile.click();

        extentLogger.info("click Edit Profile");
        profilePage.profileTabs("Edit Profile");

        extentLogger.info("Verify that email adress");
        String textActualEmail = profilePage.profilEmail_loc.getAttribute("value");
        String expectedEmail="zafer@gmail.com";
        Assert.assertEquals(textActualEmail,expectedEmail);

        extentLogger.info("Verify that navigate back to dashboard");
        driver.navigate().back();

        extentLogger.info("Verify that dashboard page title");
        String dashboardActualTitle = dashboardPage.dashboardPageTitle_loc.getText();
        String expecteddashboardTitlr="Dashboard";
        Assert.assertEquals(dashboardActualTitle,expecteddashboardTitlr);



    }
    @Test
    public void userInfoHocanınYaptıgıUsttekiIleAynı() {
        LoginPages loginPages=new LoginPages();
        DashboardPage dashboardPage=new DashboardPage();
        ProfilePage profilePage=new ProfilePage();

        extentLogger=report.createTest("User Info Verification ");

        extentLogger.info("Login as a user");
        loginPages.loginUser_met();

        String expectedAccountName="zafer";
        extentLogger.info("Verify that login is successful and account name is " +
                expectedAccountName);
        String actualAccountName=loginPages.getAccountName_mtd(expectedAccountName);
        System.out.println("actualAccountName = " + actualAccountName);
        Assert.assertEquals(actualAccountName,expectedAccountName);

        extentLogger.info("Click on My profile");
        //loginPages.navigateToModule("My Profile","");
        dashboardPage.myProfile.click();

        String profileTab="Edit Profile";
        extentLogger.info("Click on Edit Profile");
        profilePage.profileTabs(profileTab);

        String expectedEmail="zafer@gmail.com";
        extentLogger.info("Verify that email values is " + expectedEmail);
        Assert.assertEquals(profilePage.profilEmail_loc
                .getAttribute("value"),expectedEmail);

        extentLogger.info("Navigate back");
        driver.navigate().back();

        extentLogger.info("Verify that Dashboard page with url");
        Assert.assertEquals(driver.getCurrentUrl()
                ,"https://www.krafttechexlab.com/index");

        extentLogger.pass("PASSED");

    }

}
