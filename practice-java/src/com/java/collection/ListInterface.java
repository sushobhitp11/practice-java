package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(20);
        list.add(40);
        list.add(60);
        list.add(80);
        list.add(100);

        System.out.println(list.get(2));
        System.out.println(list.hashCode());
        System.out.println(list.indexOf(80));
        System.out.println(list.subList(0,4));
        System.out.println(list.lastIndexOf(40));

        System.out.println("============================");

        LinkedList l = new LinkedList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println(l.element());
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.peek() + "peeek");
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());

        System.out.println(l.offer(20));
        System.out.println(l);

        System.out.println(l.offerFirst(100));
        System.out.println(l.offerLast(80));
        System.out.println(l);

        System.out.println("**********************");

        Stack  s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.empty());
        System.out.println(s.peek());
        System.out.println(s.search(5));
        System.out.println(s.pop());

        System.out.println("---------------------");

        Vector v = new Vector();

        v.add(50);
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);

        System.out.println(v.elementAt(2));
        System.out.println(v.subList(1,3));
        System.out.println(v.hashCode());
        System.out.println(v.size());
        System.out.println(v.capacity());

    }
}
