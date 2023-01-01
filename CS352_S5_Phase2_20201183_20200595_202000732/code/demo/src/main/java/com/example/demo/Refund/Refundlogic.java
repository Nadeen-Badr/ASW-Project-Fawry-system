package com.example.demo.Refund;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.User.User;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class Refundlogic
{
    @Autowired
  RefundRipo ripo ;



    public Refundlogic() {
    }

    public  void SaveRefund(Refund newrefund, User user)
    {
        ripo.getRefundlist().put(ripo.getRefundlist().size() + 1, newrefund);
        ripo.getRefunds().put(ripo.getRefundlist().size() , user);
    }

    public void  Addingfunds(int id)
    {
      ripo.addrefund(id);
    }
    public boolean SearchRefund(int id)
    {
        if (ripo.getRefundlist().containsKey(id)) {
             return true ;
        } else
            return false ;
    }
    public HashMap<Integer, Refund> getRefundlist()
    {
        return ripo.getRefundlist() ;
    }
    public void removerrefund(int  id)
    {
        ripo.remove(id) ;
    }



}