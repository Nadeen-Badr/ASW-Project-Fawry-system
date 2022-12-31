package com.example.yarb.Refund;

import java.util.HashMap;

import com.example.yarb.Payment.Transaction;
import com.example.yarb.Payment.UserTransaction;
import com.example.yarb.User.User;
import com.example.yarb.User.UserControl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class RefundController
{
    Refundlogic refundlogic = new Refundlogic();

    @RequestMapping(value = "/requestRefund", method = RequestMethod.POST)
    public String Saveredund(@RequestBody Refund refund)
    {
        if (UserControl.currentu.getUserName() == null)
        {
            return "You should log in before making ant refund";
        }
        else
        {
            for (Transaction t :UserTransaction.PaymentTransation )
            {
               if (t.getType().equals(refund.getService()))
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
        HashMap<Integer, Refund> list= refundlogic.ripo.getRefundlist();
        return list ;
    }

    @RequestMapping(value = "/AcceptRefund", method = RequestMethod.PUT)
    public  String  acceptrefund(@RequestParam("Refund id") int id)
    {
       boolean flag= refundlogic.SearchRefund(id) ;
           getrefunds();
          if (flag==false)
              return "this Refundid is incorrect " ;
          else
          {
              refundlogic.Addingfunds(id) ;
              refundlogic.removerrefund(id) ;
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

