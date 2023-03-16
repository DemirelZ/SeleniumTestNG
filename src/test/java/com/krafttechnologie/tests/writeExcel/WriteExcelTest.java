package com.krafttechnologie.tests.writeExcel;

import org.testng.annotations.Test;



public class WriteExcelTest {

    WriteExcel obj= new WriteExcel();


//    @Test
//    public void writeExcelTest1() throws Exception {
//
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+1+" * "+i+" = "+(1*i)+"", i, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+2+" * "+i+" = "+(2*i)+"", i+10, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+3+" * "+i+" = "+(3*i)+"", i+20, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+4+" * "+i+" = "+(4*i)+"", i+30, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+5+" * "+i+" = "+(5*i)+"", i+40, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+6+" * "+i+" = "+(6*i)+"", i+50, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+7+" * "+i+" = "+(7*i)+"", i+60, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+8+" * "+i+" = "+(8*i)+"", i+70, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+9+" * "+i+" = "+(9*i)+"", i+80, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+9+" * "+i+" = "+(9*i)+"", i+90, 2);
//        }
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+10+" * "+i+" = "+(10*i)+"", i+100, 2);
//        }






//    }


    @Test
    public void writeExcelTest() throws Exception {

        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11; j++) {


                int deger=i*j;
                String s = Integer.toString(deger);
                obj.writeExcel("Test", " "+i+" * "+j+" = "+(i*j)+"", i, j);


            }


        }
    }













    @Test
    public void writeExcelTest2() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+2+" * "+i+" = "+(2*i)+"", i, 4);
        }
    }
    @Test
    public void writeExcelTest3() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+3+" * "+i+" = "+(3*i)+"", i, 4);
        }
    }
    @Test
    public void writeExcelTest4() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+4+" * "+i+" = "+(4*i)+"", i, 6);
        }
    }
    @Test
    public void writeExcelTest5() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+5+" * "+i+" = "+(5*i)+"", i, 8);
        }
    }
    @Test
    public void writeExcelTest6() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+6+" * "+i+" = "+(6*i)+"", i, 10);
        }
    }
    @Test
    public void writeExcelTest7() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+7+" * "+i+" = "+(7*i)+"", i, 12);
        }
    }
    @Test
    public void writeExcelTest8() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+8+" * "+i+" = "+(8*i)+"", i, 14);
        }
    }
    @Test
    public void writeExcelTest9() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+9+" * "+i+" = "+(9*i)+"", i, 16);
        }
    }
    @Test
    public void writeExcelTest10() throws Exception {

        for (int i = 1; i < 11; i++) {

            obj.writeExcel("Test", " "+10+" * "+i+" = "+(10*i)+"", i, 18);
        }
    }




//    public static void main(String[] args) {
//
//        for (int k = 1; k < 11; k++) {
//
//            for (int i = 1; i < 11; i++) {
//
//                System.out.println(""+k+"*"+i+"="+(k * i));
//
//            }
//        }
//    }










//    @Test
//    public void writeExcelTest() throws Exception {
//
//        for (int i = 0; i < 30; i++) {
//
//            obj.writeExcel("Test", "", 1, i+3);
//
//            for (int j = 1; j < 11; j++) {
//
//                obj.writeExcel("Test", "", 2, j+2);
//
//                for (int k = 1; k < 11; k++) {
//
//                    obj.writeExcel("Test", (k*j)+"", k, i);
//
//                }
//
//            }
//
//        }
//
//
//
//        for (int i = 1; i < 10; i++) {
//
//            obj.writeExcel("Test", (i*i)+"", 1, 2);
//
//
//        }
//
//
//
//    }
//
//    @Test
//    public void writeExcelTestMetin() throws Exception {
//        obj.writeExcel("Test", "DÜNYA", 1, 3);
//    }




//    @Test
//    public void writeExcelTest1() throws Exception {
//
//        for (int i = 1; i < 11; i++) {
//
//            obj.writeExcel("Test", " "+1+" * "+i+" = "+(1*i)+"", i, 2);
//        }
//    }


}
