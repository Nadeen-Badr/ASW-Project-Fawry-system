package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Payment.CreditForm;
import com.example.demo.Payment.UserTransaction;

@RestController
@Service
public class UserControl {

    public UserControl(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    UserLogic userLogic ;
    public static User currentu=new User();

    @PostMapping (value = "/signup")
    public String SignUp(@RequestBody User user) {

        if (userLogic.checkname(user.userName)) {
            userLogic.addnewUser(user);
            return ("Success Sign Up ");
        } else
            return ("please enter another name");
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String SignIn(@RequestBody User user) {
        User obj = userLogic.check(user.userName, user.password);

        if (obj == null) {
            return "this email or password is not correct";

        } else {
            currentu = obj;
            return "log in is done Hello " + obj.userName;

        }

    }


    @RequestMapping(value = "/wallet", method = RequestMethod.PUT)
    public String AddWallet(@RequestParam("amount") float amount , @RequestBody CreditForm creditForm)
    {
        UserTransaction userTransaction = new UserTransaction();
        if (UserControl.currentu.getUserName() == null) {
            return "you can't add to wallet please log in first";
        }

       userTransaction.AddWalletTransation(UserControl.currentu.getUserName(), amount);
        UserControl.currentu.getW().setBalance(UserControl.currentu.getW().getbalance() + amount);
        return "Success you added : " + amount + " and the total balance is : " + UserControl.currentu.getW().getbalance();

    }
}






