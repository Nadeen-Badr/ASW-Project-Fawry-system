package com.example.demo.Refund;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Payment.Transaction;
import com.example.demo.Payment.UserTransaction;
import com.example.demo.User.UserControl;
@Service
@SpringBootApplication
@RestController
public class RefundController
{ @Autowired
    Refundlogic refundlogic ;

    @RequestMapping(value = "/requestRefund", method = RequestMethod.POST)
    public String Requestredund(@RequestBody Refund refund)
    {
        if (UserControl.currentu.getUserName() == null)
        {
            return "You should log in before making ant refund";
        }
        else
        {
            for (Transaction t :UserTransaction.PaymentTransation )
            {
               if (t.getType().equals(refund.getService())&&t.getUsername().equals(UserControl.currentu.getUserName()))
               {
                   refundlogic.SaveRefund(refund,UserControl.currentu) ;
                   return "Refund in completed" ;
               }
            }
        }
        return "you did't do any transation to this service" ;
    }

   @RequestMapping(value = "/getrefundlist", method = RequestMethod.GET)
    public HashMap<Integer,Refund> getrefunds()
    {
        HashMap<Integer, Refund> list= refundlogic.getRefundlist();
        return list ;
    }

    @RequestMapping(value = "/AcceptRefund", method = RequestMethod.PUT)
    public  String  acceptrefund(@RequestParam("Refund id") int id)
    {
       boolean flag= refundlogic.SearchRefund(id) ;

          if (flag==false)
              return "this Refundid is incorrect " ;
          else
          {
              refundlogic.Addingfunds(id) ;
              //refundlogic.removerrefund(id) ;
              return "Adding funds is complete" ;
          }
    }

    @RequestMapping(value = "/RejectedRefund", method = RequestMethod.DELETE)
    public  String Rejectrefund(@RequestParam("Refund id") int id)
    {
        boolean flag= refundlogic.SearchRefund(id) ;
        if(flag==true)
        {
            refundlogic.removerrefund(id) ;
            return "ReFund iS Rejected" ;
        }
        else
            return "this Refundid is incorrect " ;
    }
    }

