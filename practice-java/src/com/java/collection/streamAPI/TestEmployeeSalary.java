package com.java.collection.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeSalary {

    public static void main(String[] args) {

        List<EmployeeSalary> l = new ArrayList<EmployeeSalary>();

        l.add(new EmployeeSalary("abc",25000));
        l.add(new EmployeeSalary("def",18000));
        l.add(new EmployeeSalary("pqr",23000));
        l.add(new EmployeeSalary("xyz",27000));

        l.stream().distinct().filter( c -> (c.getSalary() >= 2000)).forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));


    }
}
