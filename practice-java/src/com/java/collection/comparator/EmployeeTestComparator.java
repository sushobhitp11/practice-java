package com.java.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTestComparator {

    public static void main(String[] args) {

        List l = new ArrayList<>();

        l.add(new Employee(1,"tuv",3000));
        l.add(new Employee(2,"abc",2000));
        l.add(new Employee(3,"xyz",1000));
        l.add(new Employee(5,"pst",5000));
        l.add(new Employee(4,"def",4000));

        EmployeeShortById byId = new EmployeeShortById();

        Collections.sort(l,byId);

        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println("ShortById : " + it.next());
        }

        EmployeeShortByName byName = new EmployeeShortByName();

        Collections.sort(l,byName);

        Iterator it1 = l.iterator();
        while(it1.hasNext()){

            System.out.println("Short By Name : " + it1.next());
        }

        EmployeeShortBySalary bySalary = new EmployeeShortBySalary();

        Collections.sort(l,bySalary);

        Iterator it2 = l.iterator();
        while(it2.hasNext()){

            System.out.println("Short By Salary : " + it2.next());
        }

        EmployeeShortByIdName byIdName = new EmployeeShortByIdName();

        Collections.sort(l,byIdName);

        Iterator it3 = l.iterator();
        while(it3.hasNext()){

            System.out.println("Short By Id/Name : " + it3.next());
        }

        EmployeeShortByIdNameSalary byIdNameSalary = new EmployeeShortByIdNameSalary();

        Collections.sort(l,byIdNameSalary);

        Iterator it4 = l.iterator();
        while(it4.hasNext()){

            System.out.println("Short By ID Name Salary : " + it4.next());
        }
    }
}
