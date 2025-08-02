package com.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {

    public static void main(String[] args) {

        Deque dequ = new ArrayDeque();

        dequ.offer(100);
        dequ.offer(200);
        dequ.offer(300);
        dequ.offer(400);
        dequ.offer(500);

        System.out.println("dequ.getFirst() : " + dequ.getFirst());
        System.out.println("dequ.peek() : " + dequ.peek());
        System.out.println("dequ.poll() : " + dequ.poll());
        System.out.println("dequ.pop() : " + dequ.pop());
        System.out.println("dequ.pollFirst() : " + dequ.pollFirst());
        System.out.println("dequ.pollLast() : " + dequ.pollLast());
        System.out.println(dequ);

    }
}
