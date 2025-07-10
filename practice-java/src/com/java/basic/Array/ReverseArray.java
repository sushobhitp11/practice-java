package com.java.basic.Array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {5,3,6,8,74,15,13,42,65};
        //int[] arr = new int[5];
       /*    arr[0] = 10;
           arr[1] = 15;
           arr[2] = 6;
           arr[3] = 20;
           arr[4] = 17;
*/
        int[] reversed = new int[arr.length];

        for (int i = arr.length -1; i >= 0; i--) {
            reversed[i]= arr[arr.length - 1 - i];
        }

        System.out.println("Original Array:" + Arrays.toString(arr));

        System.out.println("Reversed Array:" + Arrays.toString(reversed) );


        }
}

