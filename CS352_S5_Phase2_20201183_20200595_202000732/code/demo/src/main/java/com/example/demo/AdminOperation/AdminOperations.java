package com.example.demo.AdminOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Payment.Transaction;
import com.example.demo.Payment.UserTransaction;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
@RestController
public class AdminOperations
{
    UserTransaction transactions =new UserTransaction() ;

    @RequestMapping(value = "/ShowAddwalletlist", method = RequestMethod.GET)
    public HashMap<String, Float> Addwalletlist()
    {
        HashMap<String, Float> addwalletlist = transactions.getAddWalletTransation();
        return addwalletlist;
    }

    @RequestMapping(value ="/Showpaymentlist", method = RequestMethod.GET)
    public List<Transaction> paymentL()
    {

        List<Transaction> paymentlist = transactions.getTransactionlist();
        return paymentlist;
    }


}
