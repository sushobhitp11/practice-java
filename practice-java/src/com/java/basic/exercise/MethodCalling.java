package com.java.basic.exercise;

public class MethodCalling {

    public static int index (int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {

            if (num == arr[i]) {

                return i;
               }
            }
            return -1;
        }
        public static void main(String[] args){

        int[] arr = {10,12,45,62,13,11};

        int num = 1;

        int index =index(arr, num);

        if(index != -1){

            System.out.println(index);
        }else{
            System.out.println(index);
        }


        }

}