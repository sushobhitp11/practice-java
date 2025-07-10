package com.java.newkeyword.example;

import java.lang.reflect.InvocationTargetException;

public class WithoutNewKeyword {

    public static  void main(String[] args) {
        try{

            Class <Sushobhit> clazz = (Class<Sushobhit>) Class.forName("com.java.newkeyword.example.Sushobhit");
            Sushobhit obj = clazz.getDeclaredConstructor().newInstance();
            obj.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
