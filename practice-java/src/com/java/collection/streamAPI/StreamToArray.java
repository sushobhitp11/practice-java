package com.java.collection.streamAPI;

import java.util.stream.Stream;

public class StreamToArray {

    public static void main(String[] args) {

        Stream <String> stringStream = Stream.of("v","c","d");

        String[] stringArray = stringStream.toArray(e -> new String[e]);

        for(String s : stringArray){

            System.out.println(s);
        }
    }
}
