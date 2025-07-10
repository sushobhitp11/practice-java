package com.java.basic.string;

public class DigitCountSum {

    public static void main(String[] args) {
        String[] name = {"sushobhit45678"};

        String str = name[0]; // Extract the first element from the array
        int count = 0, sum = 0;


        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
            }
            count++;
            sum += Character.getNumericValue(ch);
        }

        System.out.println("Count of digits: " + count);
        System.out.println("Sum of digits: " + sum);
    }
}
