package com.example.demo.Payment;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User.*;
@RestController
public class Paymentcontroller
{

   PaymentForm paymentform;
   List<String>s=new ArrayList<String>();
   
   

 public String PaymentMethod()
   {
    
       String method=paymentform.Form() ;
        if(method.equals("cash"))
        {
           return  "cash" ;
        }
        else if(method.equals("credit"))
        {
           return "credit" ;
        }
        else if(method.equals("wallet"))
        {
           return "wallet" ;
        }
        else
            return "no such method" ;
   }

@RequestMapping(value = "/pay", method = RequestMethod.POST)
    public String payment(@RequestBody Transaction t) {
            //Transaction tran=new Transaction();
           Transaction tran=new Transaction();
           // tran.name= t.name;
            //tran.type= t.type;
            //tran.amounnt= t.amounnt;
           tran.addTransaction(t);
         return ("Payment added succsefully");

        
      }

   

   @RequestMapping(value = "/paylist", method = RequestMethod.GET)
   public List<String> paymentL() {
           
         for(Transaction t:Transaction.l)
          
          s.add((t.name+" " +t.type+" " +t.amounnt +"  "));

       return s;
     }

   }  
   
