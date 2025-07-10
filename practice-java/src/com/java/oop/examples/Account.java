package com.java.oop.examples;

public class Account {

   public double balance;

   public double getBalance(){
       return balance;
   }
   public void setBalance(double balance){
       this.balance = balance;
   }

   public void Deposite(int amt){

       System.out.println("Total balance " + balance);
       System.out.println("Depsite amt " + amt);
       balance = balance + amt;
       System.out.println("After Deposite amt " + balance);

   }
   public void Withdraw(int amt){

       if((balance - 2000) < amt){

           System.out.println("Low balance " + balance);
       }else{

           System.out.println("Total balance " + balance);
           System.out.println("withdraw amt " + amt);
           balance = balance - amt;
           System.out.println("After Withdraw amt " + balance);
       }
   }

    public static void main(String[] args) {
         Account a = new Account();
         a.setBalance(2000);
         a.Deposite(1000);
         a.Withdraw(1000);
    }
}
