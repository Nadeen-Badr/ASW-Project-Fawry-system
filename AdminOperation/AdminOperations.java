package com.example.yarb.AdminOperation;

import com.example.yarb.Payment.Transaction;
import com.example.yarb.Payment.UserTransaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;

public class AdminOperations
{
    UserTransaction transactions =new UserTransaction() ;
    @RequestMapping(value = "/Showpaymentlist", method = RequestMethod.GET)
    public List<Transaction> paymentL()
    {

        List<Transaction> paymentlist = transactions.getTransactionlist();
        return paymentlist;
    }

    @RequestMapping(value = "/ShowAddwalletlist", method = RequestMethod.GET)
    public HashMap<String, Float> Addwalletlist()
    {
        HashMap<String, Float> addwalletlist = transactions.getAddWalletTransation();
        return addwalletlist;
    }


}
