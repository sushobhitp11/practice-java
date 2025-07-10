package com.java.basic.Array;

public class FindMaximum {

    public static void main(String[] args) {

        int[] arr= {20,5,9,6,7,55,84,25,34,15,74};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(" Maximum = " + max);


    }
}
