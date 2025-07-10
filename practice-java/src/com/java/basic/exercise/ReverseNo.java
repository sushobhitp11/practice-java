package com.java.basic.exercise;

public class ReverseNo {

    public static void main(String[] args) {

        int num = 12345;
         int num2 = num;
         int temp =0;
         int r = 0;

         while(num2 != 0){
             r = num2 % 10;
             temp = temp * 10 + r;

             num2 = num2/10;
         }
        System.out.print(temp);
    }
}
