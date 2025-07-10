package com.java.oop.examples;

public class Dog extends Animal {

    public void Sound(){

        System.out.println("this is dog sound");
    }

    public static void main(String[] args) {

        Animal a = new Dog();

        a.Sound();
    }

}
