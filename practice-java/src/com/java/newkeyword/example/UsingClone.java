package com.java.newkeyword.example;

public class UsingClone {

    public static void main(String[] args) {
        Sushobhit1 original = new Sushobhit1();
        Sushobhit1 clone = (Sushobhit1) original.clone();
        clone.display();
    }
}
