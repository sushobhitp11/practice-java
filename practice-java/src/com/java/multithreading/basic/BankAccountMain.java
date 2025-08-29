package com.java.multithreading.basic;

class BankAccount {

    private int balance;

    public BankAccount(int amount) {
        this.balance = amount;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance!!!");
        } else {
            balance -= amount;
        }
    }

    public int checkBalance() {
        return balance;
    }
}

class DepositTask implements Runnable {

    private final BankAccount bankAccount;
    private final int amount;
    private final String username;

    public DepositTask(BankAccount bankAccount, int amount, String username) {
       this.bankAccount = bankAccount;
       this.amount = amount;
       this.username = username;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(username);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bankAccount.deposit(amount);
        System.out.println(Thread.currentThread().getName() + " has deposited amount = " + amount +
                " | Current Balance: " + bankAccount.checkBalance());
    }
}

class WithdrawTask implements Runnable {

    private final BankAccount bankAccount;
    private final int amount;
    private final String username;

    public WithdrawTask(BankAccount bankAccount, int amount, String username) {
        this.bankAccount = bankAccount;
        this.amount = amount;
        this.username = username;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(username);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bankAccount.withdraw(amount);
        System.out.println(Thread.currentThread().getName() + " has withdrawn amount = " + amount +
                " | Current Balance: " + bankAccount.checkBalance());
    }
}

public class BankAccountMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount(1000);

        System.out.println("Initial Balance: " + bankAccount.checkBalance());

        Thread d1 = new Thread(new DepositTask(bankAccount, 500, "Anurag"));
        Thread d2 = new Thread(new DepositTask(bankAccount, 300, "Sushobhit"));

        Thread w1 = new Thread(new WithdrawTask(bankAccount, 600, "Sushobhit"));
        Thread w2 = new Thread(new WithdrawTask(bankAccount, 1000, "Anurag"));

        d1.start();
        d1.join();

        d2.start();
        d2.join();

        w1.start();
        w1.join();

        w2.start();
        w2.join();

        System.out.println("Final Balance: " + bankAccount.checkBalance());

    }
}
