package com.example.demo.Payment;

import com.example.demo.Providers.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Providers.ServiceController;
import com.example.demo.User.UserControl;

import java.util.HashMap;
import java.util.List;

@RestController
public class Paymentcontroller
{
    Transaction tran = new Transaction();
    UserTransaction transactions = new UserTransaction();
     public PaymentStartegy  PaymentMethod(String method)
     {
         ServiceController serviceController = new ServiceController() ;
         if (method.equals("cash"))
         {
             serviceController.setpayment( new Cashpayment()) ;
             return new Cashpayment();
         }
         else if (method.equals("credit"))
         {
             serviceController.setpayment( new Creditcardpayment()) ;
             return new Creditcardpayment();
         }
         else if (method.equals("wallet"))
         {
             serviceController.setpayment( new Walletpayment()) ;
             return new Walletpayment();
         }
         else
         {

             return null;
         }
     }
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public String payService(@RequestBody Transaction t)
    {

        if (UserControl.currentu.getUserName() == null) {
            return "You Should sign up before making any transaction";
        }

        if (PaymentMethod(t.getPaymentMethod()).pay(t.getAmount()))
        {
        t.username = UserControl.currentu.getUserName();
        UserControl.currentu.setNumoftransaction(UserControl.currentu.getNumoftransaction() + 1);
        transactions.addPaymentransation(t);
         return "Payment is successful" ;
        }
        else
        {
            return"Payment failed please check your wallet or creditinfo" ;
        }

    }


}
   
