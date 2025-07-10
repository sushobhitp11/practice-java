package com.java.basic.exercise;

public class FunctionalInterLembdaTest {

    public static void main(String[] args) {
        FunctionalInter f = (a, b) -> {
            return a + b;
        };
        int a = 10;
        int b = 20;
        System.out.println("Sum: " + f.sum(a, b));

        f.sub(a, b);

        FunctionalInter.multi(a, b);
    }

}
