package com.java.collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudentComparable {

    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(new Student(6,"abc"));
        l.add(new Student(4,"def"));
        l.add(new Student(2,"ghi"));
        l.add(new Student(3,"pqr"));
        l.add(new Student(1,"xyz"));


        Collections.sort(l);

        Iterator it = l.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}
