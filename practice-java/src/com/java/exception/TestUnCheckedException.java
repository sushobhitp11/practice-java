package com.java.exception;

public class TestUnCheckedException {
    public void dad(){
        try{
            mom();
        }catch(UnCheckedException e){
            e.printStackTrace();
        }
    }
    public void mom(){
        son();
    }
    public void son(){
        throw new RuntimeException("I am ready to handle at runtime");
    }

    public static void main(String[] args) {

        TestUnCheckedException t = new TestUnCheckedException();

        t.dad();
    }
}
