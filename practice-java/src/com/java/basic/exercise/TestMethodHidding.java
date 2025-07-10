package com.java.basic.exercise;

public class TestMethodHidding {

    public static void main(String[] args) {

        MethodHidding obj = new MethodHidding2();
        obj.display();
        MethodHidding2.display();
    }
}
