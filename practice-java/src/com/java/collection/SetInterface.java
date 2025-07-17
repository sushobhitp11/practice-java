package com.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {

        HashSet h = new HashSet();

        h.add(100);
        h.add(200);
        h.add(99);
        h.add(01);
        h.add(17);
        h.add(55);

        System.out.println(h.contains(01));
        System.out.println(h.isEmpty());
        System.out.println(h.size());
        System.out.println(h.remove(01));
        System.out.println(h);
        System.out.println(h.hashCode());

        System.out.println("///////////////////////");

        TreeSet t = new TreeSet();

        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);

        System.out.println(t.contains(3));
        System.out.println(t.ceiling(3));
        System.out.println(t.first());
        System.out.println(t.pollFirst());
        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.pollLast());
        System.out.println(t);

        System.out.println("##########################");


        LinkedHashSet l = new LinkedHashSet();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);


        System.out.println(l.contains(2));
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l.remove(4));
        System.out.println(l);
        System.out.println(l.hashCode());
        System.out.println(l.toArray());

    }
}
