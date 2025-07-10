package com.java.basic.exercise;

public class FunctionalInterTest {

    public static void main(String[] args) {

        FunctionalInter f = new FunctionalInter() {

            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        int a =10 ;
        int b =20 ;

        System.out.println("sum: " + f.sum(a,b));

        f.sub(a,b);

        FunctionalInter.multi(a,b);

    }
}
