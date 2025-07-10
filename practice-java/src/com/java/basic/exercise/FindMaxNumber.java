package com.java.basic.exercise;

public class FindMaxNumber {
    public static void main(String[] args) {

        int i = 27;
        int j = 21;

        int maximumNumber  = (i<j)? j:i;
        System.out.println("maximum number is =" + maximumNumber);

        int smallerNumber = (i>j)? j:i;
        System.out.println("smaller number is ="+ smallerNumber);

    }
}
