package com.krafttechnologie.tests.day14_propertiesAndSingleton;

public class Singleton {



    private Singleton(){

    }

    private static String str;

    public static String getInstance(){

        if(str==null){
            System.out.println("str is null");
            str="some value";
        }else {
            System.out.println("it has vaşue, just return it");
        }
        return  str;
    }

}
