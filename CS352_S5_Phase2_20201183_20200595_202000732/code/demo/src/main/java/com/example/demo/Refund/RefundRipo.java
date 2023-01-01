package com.example.demo.Refund;

import java.util.HashMap;

import com.example.demo.User.User;
import org.springframework.stereotype.Service;

@Service
public class RefundRipo

{
  private static HashMap<Integer, Refund> refundlist = new HashMap<Integer, Refund>(); //admin
   private static HashMap<Integer, User> refunds = new HashMap<Integer, User>();
    static HashMap<Integer, User> getRefunds()
    {
        return refunds;
    }


    public HashMap<Integer, Refund> getRefundlist() {
        return refundlist;
    }
    public  void  addrefund(int id)
    {
        getRefunds().get(id).getW().setBalance(getRefunds().get(id).getW().getbalance() + getRefundlist().get(id).getAmount());
    }

    public static void remove(int id)
    {
        refundlist.remove(id);
    }

}
