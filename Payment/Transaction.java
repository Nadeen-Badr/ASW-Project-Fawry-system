package com.example.demo.Payment;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
    public String name;
    public String type;
    public float amounnt;
   public static List<Transaction> l=new ArrayList<Transaction>();
    public void addTransaction(Transaction t){
       this.name=t.name;
        this.type=t.type;
        this.amounnt=t.amounnt;
        l.add(t) ;

    }
    
}
