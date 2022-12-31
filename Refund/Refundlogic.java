package com.example.yarb.Refund;



import com.example.yarb.Payment.Transaction;
import com.example.yarb.User.User;
import com.example.yarb.User.UserControl;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.example.yarb.Refund.RefundRipo.getRefunds;

@Service
public class Refundlogic
{
  RefundRipo ripo ;

    public Refundlogic(RefundRipo ripo) {
        this.ripo = ripo;
    }

    public Refundlogic() {
    }

    public  void SaveRefund(Refund newrefund, User user) {
        ripo.getRefundlist().put(ripo.getRefundlist().size() + 1, newrefund);
        ripo.getRefunds().put(ripo.getRefundlist().size() , user);
    }




    public void  Addingfunds(int id)
    {
      ripo.getRefunds().get(id).getW().setBalance(ripo.getRefunds().get(id).getW().getbalance() + ripo.getRefundlist().get(id).getAmount());
    }
    public boolean SearchRefund(int id) {
        if (ripo.getRefundlist().containsKey(id)) {
             return true ;
        } else
            return false ;
    }
    public void removerrefund(int  id)
    {
        ripo.remove(id) ;
    }


}