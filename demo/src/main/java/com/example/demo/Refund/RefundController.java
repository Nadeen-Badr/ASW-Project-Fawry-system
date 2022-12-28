package com.example.demo.Refund;

import java.util.LinkedList;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class RefundController
{
    Refundlogic refundlogic=new Refundlogic() ;

    @RequestMapping(value = "/requestRefund", method = RequestMethod.POST)
    public String Saveredund(@RequestBody Refund refund)
    {
        
        Refund newrefund=new Refund() ;
        newrefund.setService(refund.getService());
        newrefund.setAmount(refund.getAmount());
        Refundlogic.SaveRefund(newrefund) ;
        return "Done";
        
    }
   
   @RequestMapping(value = "/RequestRefund", method = RequestMethod.GET)
    public LinkedList<Refund> getrefunds()
    {
        LinkedList<Refund> list =  Refundlogic.getRefundList();
        return list ;
    }
}