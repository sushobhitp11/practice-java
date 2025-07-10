package com.java.newkeyword.example;

import java.lang.reflect.Constructor;

public class UsingReflection {

    public static void main(String[] args) {
         try{

             Constructor<Sushobhit4> constructor = Sushobhit4.class.getDeclaredConstructor();
             Sushobhit4 example = constructor.newInstance();
             example.display();
         }catch (Exception e){
             e.printStackTrace();

         }
    }
}
