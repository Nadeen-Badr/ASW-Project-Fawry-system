package com.example.demo.Refund;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Refundlogic
{
    Refund refund =new Refund();
    static LinkedList<Refund> List= new LinkedList<Refund>() ;

    public static void SaveRefund(Refund newrefund)
    {
        List.add(newrefund) ;
    }

    public static LinkedList<Refund> getRefundList()
    {
      return List ;
    }

}
