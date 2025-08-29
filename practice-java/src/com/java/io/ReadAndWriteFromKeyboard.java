package com.java.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteFromKeyboard {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileWriter fw = new FileWriter("D://Sushobhit//pandey",true);

        System.out.println("enter text here,,,,,,,,,");

        String str = br.readLine();

        while(str != null){
            fw.write(str);

            System.out.println(str);

            str = br.readLine();
        }

        br.close();
        fw.close();
    }
}
