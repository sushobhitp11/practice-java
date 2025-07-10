package com.java.exception;

public class TestCheckedException {

    public static void dad(){
          try{
              mom();
          }catch(CheckedException e){
             e.printStackTrace();
          }
    }
    public static void mom() throws CheckedException{
        son();

    }
    public static void son() throws CheckedException{
        throw new CheckedException(" I am sorry dad ");
    }

    public static void main(String[] args) {

        dad();
    }
}
