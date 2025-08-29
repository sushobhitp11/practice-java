package com.java.multithreading.basic;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        for (int i =0; i<5; i++) {
            System.out.println("Running Thread - " + Thread.currentThread().getName() + " " +i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableThread());
        t.start();
    }
}
