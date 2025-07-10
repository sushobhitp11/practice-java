package com.java.basic.string;

import java.util.Arrays;

public class CountAndSumDigits {

    public static void main(String[] args) {
        String[] name = {"sushobhit45678"};

        String str = name[0]; // Extract the first element from the array
        String digitStr = ""; // To store extracted digits

        int digitCount = 0, digitSum = 0;

        // Extract digits from the string
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitStr += ch;
            }
        }

        // Convert digit string into an integer array
        int[] intArray = new int[digitStr.length()];
        for (int i = 0; i < digitStr.length(); i++) {
            intArray[i] = Character.getNumericValue(digitStr.charAt(i));
            digitSum += intArray[i]; // Calculate sum of digits
        }

        digitCount = digitStr.length(); // Count of digits

        // Print results
        System.out.println("Extracted Digits Array: " + Arrays.toString(intArray));
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }
}
