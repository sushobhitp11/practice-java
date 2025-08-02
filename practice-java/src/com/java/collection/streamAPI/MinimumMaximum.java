package com.java.collection.streamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumMaximum {

    public static void main(String[] args) {
         int[] i = {10,12,17,55,45,23};

        Arrays.stream(i).max().ifPresent(e -> System.out.println("Minimum" + e));
    }+
















}
