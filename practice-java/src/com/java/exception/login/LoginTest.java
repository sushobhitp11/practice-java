package com.java.exception.login;

public class LoginTest {

    public static void main(String[] args) {

        LoginExample l = new LoginExample();
           try{
               l.login("admin","susho");
           } catch(LoginException e){
               System.out.println(e.getMessage());
           }

    }
}
