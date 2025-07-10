package com.java.basic.string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "jar";
        String str2 = "raj";

        char[] ar1 = str1.toCharArray();
        char[] ar2 = str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1,ar2)) {
            System.out.println(str1 + " " + str2 + "is a Anagram");
        }else{
            System.out.println(str1 + " " +str2 + "is not Anagram");
        }
    }
}
