package com.example.demo.User;

public class UserLogic{
    Accounts ac = new Accounts();

    public User check(String name, String pass) {
        User obj = ac.getAccount(name);
        if (obj == null) {
            return null;
        } else {
            if (obj.password.equals(pass)) {

                return obj;
            } else
                return null;

        }
    }

    public boolean checkname(String name) {
        for (User ac : Accounts.accountList) {
            if (ac.userName.equals(name)) {
                return false;
            }

        }
        return true;

    };
}