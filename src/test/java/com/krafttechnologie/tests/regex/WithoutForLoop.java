package com.krafttechnologie.tests.regex;

import java.util.stream.IntStream;

public class WithoutForLoop {
    public static void main(String[] args) {

        //withoutForLoopNTo0(100);


        //withoutForLoop0ToN(0);


       //withoutForLoop0ToN1(20,10);




    }


    public static void withoutForLoopNTo0(int n){
        if(n>0){

            System.out.println(n);
            n--;
        //  n--;
            withoutForLoopNTo0(n);

        }

    }

    public static void withoutForLoop0ToN(int n){


        if(100>n){

            System.out.println(n);
            n++;

            withoutForLoop0ToN(n);

        }

    }

    public static void withoutForLoop0ToN1(int n, int k){
        int max = Math.max(n, k);
        int min = Math.min(n, k);

        if(max>min){

            System.out.println(min);
            min++;

            withoutForLoop0ToN(min);

        }

    }

}
