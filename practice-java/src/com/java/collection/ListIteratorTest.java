package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(10);
        l.add(20);
        l.add("sushobhit");
        l.add("pandey");

        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
