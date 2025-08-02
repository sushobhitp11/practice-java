package com.java.collection;

public class EqualHashCodeTest {

    public static void main(String[] args) {

        EqualHashCode e1 = new EqualHashCode(1,"sushobhit",1200);
        //EqualHashCode e2 = new EqualHashCode(1,"sushobhit",1200);

        String  e3 = " Iam not a equal Hashcode object";

        if(e1.equals(e3)){
            if(e1.hashCode() == e3.hashCode()){
                System.out.println("Equals");
            }
        }else{
            System.out.println(" Not Equals ");
        }
    }
}
