package com.java.multithreading.basic;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i =0; i<5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Running Thread - " + Thread.currentThread().getName() + " " +i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setName("subham-thread");
        //t1.join();
        t1.setDaemon(true);
        t1.start();
        //t1.join();
        Thread.sleep(4000);
        System.out.println("Running Thread - " + Thread.currentThread().getName());

    }
}
