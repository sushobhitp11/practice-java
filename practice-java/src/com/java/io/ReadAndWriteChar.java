package com.java.io;

import java.io.*;
import java.nio.file.FileVisitResult;

public class ReadAndWriteChar {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("D:\\test.txt");

//        FileWriter w = new FileWriter("D:\\test.txt.txt");
//
//        char[] cArray = {'o','k'};
//
//        w.write(cArray);
//        w.write(',');
//        w.write("Looks good");
//
//        w.close();

        int ch = reader.read();

        char chr;

        while ( ch != -1){
            chr = (char) ch;
            System.out.print(chr);
            ch = reader.read();
        }

        reader.close();
    }
}
