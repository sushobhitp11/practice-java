package com.java.exception;

public class PropogateExampl {

    public static  void method3(){

        System.out.println("inside method 3 ");

        int a = 50/0;

    }
    public static void method2(){
        method3();
    }
    public static void method1(){
        method2();
    }

    public static void main(String[] args) {

        try{
            method3();
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
