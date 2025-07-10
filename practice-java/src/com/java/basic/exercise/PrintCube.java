package com.java.basic.exercise;

public class PrintCube {

    public static void main(String[] args) {

        int num = 7;
        int cube = 1;

        for (int i = 1; i <= 3; i++) {

            cube = num*cube;


        }

        System.out.println(cube);


        System.out.println(num*num*num);


        System.out.println(Math.pow(7,3));

    }
}
