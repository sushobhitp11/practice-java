package com.java.exception.login;

public class LoginExample {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String userName,String password) throws LoginException{

        if("admin".equals(userName) && "admin".equals(password)){

           System.out.println("login Sucessfull");
        }else{
            throw new LoginException("invalid userName or password");
        }
    }
}
