package com.java.newkeyword.example;

import java.io.*;

public class UsingDeserialization {

    public static void main(String[] args) {
        try {
             Sushobhit2 original = new Sushobhit2();
            FileOutputStream fos = new FileOutputStream("example.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(original);
            oos.close();

            FileInputStream fis = new FileInputStream("example.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Sushobhit2 deserialized = (Sushobhit2) ois.readObject();
            ois.close();

            deserialized.display();

        } catch(IOException | ClassNotFoundException e) {
        }

    }
}