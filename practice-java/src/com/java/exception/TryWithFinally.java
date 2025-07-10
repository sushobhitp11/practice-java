package com.java.exception;

public class TryWithFinally {

    public static void main(String[] args) {

        String s = "sushobhit";
        try{
            s.charAt(10);
            System.out.println("try");

        }finally{
            System.out.println("this is finally block");
        }
    }
}
