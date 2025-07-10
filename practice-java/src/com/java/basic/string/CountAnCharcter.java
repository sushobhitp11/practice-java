package com.java.basic.string;

public class CountAnCharcter {

    public static void main(String[] args) {

        String name = "Puneet";

        int count = 0;

        System.out.println(" length of the name = " + name.length());

        for (int i = 0; i < name.length(); i++) {

            if('e' == name.charAt(i)){
                count++;
            }
            
        }
        if(count != 0){
            System.out.println(" e = " + count);
        }else{
            System.out.println("e is not found");
        }
    }
}
