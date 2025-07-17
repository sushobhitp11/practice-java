package com.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapInterface {

    public static void main(String[] args) {

        HashMap h = new HashMap();

        h.put(1,"a");
        h.put(2,"b");
        h.put(3,"c");
        h.put(4,"d");


        System.out.println(h.size());
        System.out.println(h.isEmpty());
        System.out.println(h.get(4));
        System.out.println(h.containsKey(4));
        System.out.println(h.containsValue("d"));

        System.out.println("***********************");

        TreeMap t = new TreeMap();

        t.put(1,"aaaa");
        t.put(2,"bbbb");
        t.put(3,"cccc");
        t.put(4,"dddd");

        System.out.println(t.firstKey());
        System.out.println(t.lastKey());
        System.out.println(t.firstEntry());
        System.out.println(t.lastEntry());

        System.out.println("......................");

        LinkedHashMap  l = new LinkedHashMap();

        l.put(1,"abc");
        l.put(2,"xyz");
        l.put(3,"efg");
        l.put(4,"pqr");

        System.out.println(l.get(2));
        System.out.println(l.containsKey(1));
        System.out.println(l.containsValue("efg"));
        System.out.println(l.entrySet());
        System.out.println(l.keySet());
        System.out.println(l.values());
    }
}
