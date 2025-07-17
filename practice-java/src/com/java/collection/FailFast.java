package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {

        List l = new ArrayList<>();

        l.add(1);
        l.add(3);
        l.add(4);
        l.add(2);

        Iterator it = l.listIterator();
        l.add(5);

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
