package com.java.basic.exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender30 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        for(int i = 1; i <= 30; i++){
            c.add(Calendar.DATE,1);

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            System.out.println(sdf.format(c.getTime()));

        }
    }
}
