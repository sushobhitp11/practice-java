package com.java.oop.examples.deep;

public class Costumer implements Cloneable{

    public String name;

    public Account no;

    public Costumer(String name){
        this.name = name;
        no = new Account(100);
    }

    @Override
    public Costumer clone() throws CloneNotSupportedException {

        Costumer c = (Costumer) super.clone();

        c.no = (Account) no.clone();

        return c;
    }
}
