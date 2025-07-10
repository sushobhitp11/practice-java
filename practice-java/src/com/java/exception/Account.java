package com.java.exception;

public class Account {

    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposite(int amt){
        balance = balance + amt;
    }
    public double withdraw(int amt) throws BankException{

        if( (balance - amt) >= 2000 ){
           balance = balance - amt;
           System.out.println("successfully withdraw");
        }else{

            throw new BankException("Insuffient fund in the account");

        }return balance;
    }

    public static void main(String[] args) {

        Account a = new Account();

        a.setBalance(5000);
        a.deposite(2000);
        try{
            a.withdraw(0);
            System.out.println(a.getBalance());
        }catch(BankException e){
            System.out.println(e.getMessage());
        }
        try{
            a.deposite(2000);
            a.withdraw(1000);
            System.out.println(a.getBalance());
        }catch(BankException e2){
            e2.printStackTrace();
        }
    }
}
