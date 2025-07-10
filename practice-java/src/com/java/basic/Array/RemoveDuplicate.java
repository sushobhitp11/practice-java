package com.java.basic.Array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    // do it in simple way .
    // rotate array by k elements .
    public static void main(String[] args) {

        int[] arr = {12,12,45,63,63,12,89,63};

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++){

            set.add(arr[i]);
           // System.out.print(arr[i] + "\t");
        }
        System.out.println(set);


        }
}
