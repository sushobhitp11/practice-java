package com.java.basic.exercise;

public class ArmStrongNo {
    public static void main(String[] args) {
        int num = 123;
        int num2 = num;
        int r = 0;
        int temp = 0;

        while (num2 != 0) {
            r = num2 % 10;
            temp = temp + r * r * r;

            num2 = num2 / 10;
        }
        if (temp == num) {
            System.out.println("153 is arm strong no.");
        } else {
            System.out.println("153 is not arm strong no.");
        }
    }
}
