package com.java.exception;

public class CheckedException extends Exception{

    public CheckedException(){
        super("faltu ki exception");
    }
    public CheckedException(String msg){
        super(msg);
    }

}
