package com.java.basic.string;

import java.util.Locale;

public class TestString {

    public static void main(String[] args) {

        //Limit ka Use
        String sentence = "Java is a powerful language";
        String[] parts = sentence.split(" ", 3);

        for (String part : parts) {
            System.out.println(part);
        }
        //Comma (,) se Split karna
        String data1 = "Rahul,Anjali,Amit,Sneha";
        String[] namess = data1.split(",");

        for (String namesss : namess) {
            System.out.println(namesss);
        }


        // String count index start from 0
        String name = "sushobhit pandey";

        //Space se Split karna
        String[] names = name.split(" ");

        for(String data: names){

            System.out.println(data);

        }
        //Special Characters se Split
        //Special characters (like . , |, \) ko split karne ke liye escape (\\) karna padta hai:
        String text = "abc.def.ghi";
        String[] parts1 = text.split("\\.");

        for (String part2 : parts1) {
            System.out.println(part2);
        }

        System.out.println(name);
        // to print length of string
        System.out.println(name.trim());
        System.out.println("String length =" + name.length());
        // to print 10th index of the string
        System.out.println(name.charAt(10));
        //to print 5th index of the string
        System.out.println(name.charAt(5));
        // to print from 7th to total index of the string
        System.out.println(name.substring(7));
        // to convert in uppercase
        System.out.println(" sushobhit pandey = " + name.toUpperCase());
        // to replace no. of letter from the string
        System.out.println("replace s to a" + name.replace('s','a'));
        System.out.println("replace h to o" + name.replace('h','o'));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(0));
        System.out.println(" sushobhit pandey = " + name.toLowerCase());
        System.out.println(" sushobhit pandey = " + name.toUpperCase());
        // to print 5th index to 10index of string
        System.out.println(name.substring(5,10));

    }
}
