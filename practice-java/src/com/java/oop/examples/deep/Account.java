package com.java.oop.examples.deep;

public class Account implements Cloneable{

    public int balance;

    public Account(int balance){
        this.balance = balance;
    }
    @Override
    public Account clone() throws CloneNotSupportedException {
        Account account = (Account) super.clone();

       return account;
    }
}
