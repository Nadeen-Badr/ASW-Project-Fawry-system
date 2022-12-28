package com.example.demo.User;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControl {

    UserLogic userLogic = new UserLogic();

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String SignUp(@RequestBody User user) {

        if (checkname(user.userName)) {
            Accounts account = new Accounts();
            User newuser = new User();
            newuser.userName = user.userName;
            newuser.password = user.password;
            account.addaccount(newuser);
            return ("Success Sign Up ");

        } else
            return ("please enter another name");
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String SignIn(@RequestBody User user) {
        User obj = check(user.userName, user.password);
        if (obj == null) {
            return "Not Sign Up";
        } else {
            return "Success Sign In";
        }
    }

}