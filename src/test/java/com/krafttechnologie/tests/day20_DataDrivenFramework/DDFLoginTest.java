package com.krafttechnologie.tests.day20_DataDrivenFramework;

import com.krafttechnologie.pages.DashboardPage;
import com.krafttechnologie.pages.LoginPages;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;

public class DDFLoginTest extends TestBase {

    @DataProvider(name = "LoginList")
    public Object[][] userData(){

        //ExcelUtil den obje oluşturuyoruz önce
        //2 parametre gerekli: dosyanın pathi ve sayfa ismi
        ExcelUtil qaTeam3=new ExcelUtil("src/test/resources/LoginList.xlsx", "QaTeam3");

        String[][] dataArray = qaTeam3.getDataArrayWithoutFirstRow();

        return dataArray;

    }

    @Test(dataProvider = "LoginList")
    public void test(String email, String password){

//        LoginPages loginPages=new LoginPages();
//        DashboardPage dashboardPage=new DashboardPage();

        System.out.println(email+"==="+password);

       // loginPages.loginWithParameters(email, password);
//        String actualName=dashboardPage.getUserName.getText();
//        String expectedName=name;
//        Assert.assertEquals(actualName,expectedName);


    }


        @DataProvider (name = "data-provider")
        public Object[][] dpMethod(){
            return new Object[][] {{"First-Value"}, {"Second-Value"}};
        }

        @Test (dataProvider = "data-provider")
        public void myTest (String val) {

//            Dimension dimension = new Dimension(400, 800);
//            driver.manage().window().setSize(dimension);

            System.out.println("Passed Parameter Is : " + val);
        }





}
