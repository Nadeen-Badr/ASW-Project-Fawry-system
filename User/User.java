package com.example.demo.User;

public class User {
    String userName;
    String password;
    public Wallet W=new Wallet();
    float wallet;
    public float add;

    public User() {
    }
   
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

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

    @Override
    public String toString() {
        return "user [userName=" + userName + ", password=" + password + "]";
    }
}
