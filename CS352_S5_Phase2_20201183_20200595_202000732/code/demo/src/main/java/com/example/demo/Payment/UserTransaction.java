package com.example.demo.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserTransaction
{
    public static List<Transaction> PaymentTransation =new ArrayList<Transaction>();
    public static HashMap<String, Float> AddWalletTransation= new HashMap<String,Float>() ;


    public static List<Transaction> getPaymentTransation() {
        return PaymentTransation;
    }

    public static HashMap<String, Float> getAddWalletTransation() {
        return AddWalletTransation;
    }


    public static List<Transaction> getTransactionlist()
    {
        return PaymentTransation;
    }
    public void addPaymentransation(Transaction t)
    {
        PaymentTransation .add(t) ;
    }
    public void AddWalletTransation(String username ,float amount)
    {
        AddWalletTransation.put(username,amount) ;
    }






}
