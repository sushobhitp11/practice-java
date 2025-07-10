package com.java.oop.examples.deep;

public class TestDeep {

    public static void main(String[] args) throws CloneNotSupportedException{

        Costumer d = new Costumer("sushobhit");

        Costumer c1 = (Costumer) d.clone();

        c1.name = "Anurag";
        c1.no.balance = 200;

        System.out.println(d.name);
        System.out.println(d.no.balance);

        System.out.println(c1.name);
        System.out.println(c1.no.balance);
    }
}
