package com.example.yarb.Refund;

import com.example.yarb.User.User;

import java.util.HashMap;

public class RefundRipo
{
  private static HashMap<Integer, Refund> refundlist = new HashMap<Integer, Refund>(); //admin
   private static HashMap<Integer, User> refunds = new HashMap<Integer, User>();
    static HashMap<Integer, User> getRefunds()
    {
        return refunds;
    }


    public static HashMap<Integer, Refund> getRefundlist() {
        return refundlist;
    }


    public static void remove(int id)
    {
        refundlist.remove(id);
    }

}
