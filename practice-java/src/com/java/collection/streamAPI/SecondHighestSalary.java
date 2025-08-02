package com.java.collection.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighestSalary {

    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add(2000);
        list.add(4000);
        list.add(5000);
        list.add(7000);
        list.add(9000);

        System.out.println("Highest Salary");

        list.stream().distinct().sorted(Collections.reverseOrder()).findFirst().ifPresent( e -> System.out.println(e));

        System.out.println("Second Highest");

        list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }


}
