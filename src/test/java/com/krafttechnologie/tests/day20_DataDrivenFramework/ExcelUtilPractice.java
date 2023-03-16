package com.krafttechnologie.tests.day20_DataDrivenFramework;

import com.krafttechnologie.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilPractice {


    @Test
    public void readExcelFile(){

        /*
        Öncelikle ExcelUtilden obje oluştur
        object iki argument alacak: Dosyanın path i ile çalışma yapacağımız sayfanın adı olacak
         */

        ExcelUtil qaTeam3=new ExcelUtil("src/test/resources/LoginList.xlsx", "QaTeam3");

        //once satır sayısını bulalım
        System.out.println("qaTeam3.rowCount() = " + qaTeam3.rowCount());

        //column sayısını bulalım
        System.out.println("qaTeam3.columnCount() = " + qaTeam3.columnCount());

        //Columnların isimlerini alalım

        System.out.println("qaTeam3.getColumnsNames() = " + qaTeam3.getColumnsNames());

        //objeye atananları list olarak çağıralım

        List<Map<String, String>> maps=qaTeam3.getDataList();

        for (Map<String, String> row : qaTeam3.getDataList()) {
            System.out.println("stringMap = " + row);
        }

        System.out.println("maps.get(2) = " + maps.get(2));

        System.out.println("maps.get(2).get(\"Password\") = " + maps.get(2).get("Password"));

        //bütün datayı 2 boyutlu alalım

        String[][] dataArray = qaTeam3.getDataArray();

        System.out.println("Arrays.deepToString(dataArray) = " + Arrays.deepToString(dataArray));

        qaTeam3.setCellData("dgedge",12,12);


    }
}
