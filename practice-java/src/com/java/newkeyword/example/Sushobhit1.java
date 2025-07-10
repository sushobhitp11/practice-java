package com.java.newkeyword.example;

public class Sushobhit1 implements Cloneable{

    public void display(){
        System.out.println("this is used with clone");
    }

    @Override
    public Sushobhit1 clone() {
        try {
            return (Sushobhit1) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
