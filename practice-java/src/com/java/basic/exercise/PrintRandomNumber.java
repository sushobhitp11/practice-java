package com.java.basic.exercise;

import java.util.Random;

public class PrintRandomNumber {
    public static void main(String[] args) {

        Random r= new Random();

        for ( int i =1;i <= 5;i++){
            int a= r.nextInt(100);
            System.out.println(a);


        }
    }
}
