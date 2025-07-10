package com.java.basic.string;

public class VowelCount {

    public static void main(String[] args) {

        String name = "Lav Kush Gautam";

        int vowelcount = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelcount++;
            }else {
                System.out.println(" no vowel found in the String");
            }

            }
        System.out.println(" number of vowels in the String = " + vowelcount);

        }
}

