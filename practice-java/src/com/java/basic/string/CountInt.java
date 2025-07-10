package com.java.basic.string;

import java.util.Arrays;

public class CountInt {

    public static void main(String[] args) {

        String[] s1 = {"sushobhit123456"};

        String s2 = "";

        for(String s: s1){

            char[] ch = s.toCharArray();

            for(int i =0;i < ch.length; i++){
               if(Character.isDigit(ch[i])){
                   s2 = s2 + ch[i];

               }
            }
        int[] intArray = new int [s2.length()];
            for(int i=0; i < s2.length(); i++){
                intArray[i] = Character.getNumericValue(s2.charAt(i));
            }
            System.out.println(Arrays.toString(intArray));
        }


    }
}
