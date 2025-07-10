package com.java.oop.examples;

public class TestShallowCloning {

    public static void main(String[] args) {

        ShallowCloning sc = new ShallowCloning();

        sc.balance = 100;

        ShallowCloning sc2 = new ShallowCloning();
        sc2.balance = 200;

        System.out.println(sc.balance);
        System.out.println(sc2.balance);


    }
}
