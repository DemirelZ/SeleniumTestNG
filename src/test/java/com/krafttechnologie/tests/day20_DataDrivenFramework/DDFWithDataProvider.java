package com.krafttechnologie.tests.day20_DataDrivenFramework;

import com.krafttechnologie.utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    // önce @dataproviderdan metodumuzu oluşturyorz
    //bu metot testimize data sağlayacak


    @DataProvider(name = "arac satis listesi")
    public Object[][] testData(){


        String [][] data={

                { "Audi", "100","80","65","55"},
                { "Honda", "112","127","135","60"},
                { "Tesla", "20","30","25","15"},
                { "Mazda", "70","50","65","75"},
                { "Porche", "40","43","22","17"},
                { "Toyota", "100","180","165","155"},
                { "Volvo", "66","33","22","77"},
                { "Mercedes", "73","80","65","55"},
        };


            return data;
    }


    @Test(dataProvider = "arac satis listesi")
    public void test(String aracMarkasi, String ocak, String subat, String mart, String nisan){

        System.out.println("Arac Markasi :" +aracMarkasi+" : "+ocak+","+subat+" ,"+mart+" ,"+nisan+"");

    }

}
