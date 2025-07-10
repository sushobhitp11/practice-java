package com.java.basic.string;

public class Palindrome {

    public static void main(String[] args) {

        String name = "naman";

        StringBuilder reversed = new StringBuilder();

        for (int i = name.length() -1; i >= 0 ; i--){
             // reversed += name.charAt(i);
            reversed.append(name.charAt(i));
        }
        if(name.equals(reversed.toString())){
            System.out.println(name + " Is a palindrome String");
        }else{
            System.out.println(name + " Is not a palindrome String");
        }
    }
}
