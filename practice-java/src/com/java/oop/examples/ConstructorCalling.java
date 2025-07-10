package com.java.oop.examples;

public class ConstructorCalling {

     String firstName;
     String lastName;
     String Address;

     public ConstructorCalling(String firstName,String lastName){
         this.firstName = firstName;
         this.lastName = lastName;

         System.out.println(firstName);
         System.out.println(lastName);
     }
     public ConstructorCalling(String firstName,String lastName,String Address){
         this(firstName,lastName);

         this.Address = Address;
         System.out.println(Address);
     }
}
