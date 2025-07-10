package com.java.oop.examples;

public class TestConstructorCalling extends ConstructorCalling{


    public TestConstructorCalling(String firstName, String lastName, String Address) {
        super(firstName, lastName, Address);
    }

    public static void main(String[] args) {

        TestConstructorCalling tc = new TestConstructorCalling("sushobhit","pandey","indore");
    }
}
