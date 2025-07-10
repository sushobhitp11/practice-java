package com.java.basic.string;

public class ReverseStringUsingStringBuffer {

    public static void main(String[] args) {

        String name = "Sushobhit";

        StringBuffer sb = new StringBuffer(name);

        sb.append(" pandey");

        sb.reverse();

        System.out.println(" Reverse String using string buffer = " + sb.toString());

    }
}
