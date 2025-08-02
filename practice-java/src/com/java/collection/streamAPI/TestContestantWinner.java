package com.java.collection.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {

    public static void main(String[] args) {

        List<ContestantWinner> l = new ArrayList<ContestantWinner>();

        l.add(new ContestantWinner("sushobhit","7894561230"));
        l.add(new ContestantWinner("shubham","5648932170"));
        l.add(new ContestantWinner("anand","1234567890"));
        l.add(new ContestantWinner("prince","5632419870"));

        l.stream().distinct().map( e -> e.getName()+ " " + e.getPhoneNo()).collect(Collectors.collectingAndThen(Collectors.toList(), c ->{

            //.collect(Collectors.collectingAndThen(...))

            // Sab string values ko list me collect kiya.

            // Us list ko shuffle (random order) kiya.

                  //  Phir us shuffled list ko dobara stream me convert kiya.

           // .limit(2) – Sirf pehle 2 entries li (random order me).

           // .forEach(...) – Un 2 logon ke naam + phone number print kiye.

            Collections.shuffle(c);
            return c.stream();
        })).limit(2).forEach(c -> System.out.println(c));
    }
}
