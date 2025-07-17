package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add('a');
        c.add('b');

        Collection c1 = new ArrayList();

        c1.add('a');
        c1.add('b');
        c1.add('c');
        c1.add('d');

        System.out.println(" c =>" + c);
        System.out.println(" c1 => " + c1);

        c.retainAll(c1);

        System.out.println(" c => " + c);
        System.out.println(" c1 => " + c1);

    }
}
