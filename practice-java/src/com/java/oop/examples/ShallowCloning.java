package com.java.oop.examples;

public class ShallowCloning implements Cloneable {

    public int balance;

    protected Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }
}