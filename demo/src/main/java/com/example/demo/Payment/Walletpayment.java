package com.example.demo.Payment;

import com.example.demo.User.*;


public class Walletpayment implements PaymentStartegy
{
	User us ;
	public Walletpayment(User us)
	{
		this.us=us ;
	}
	@Override
      public String  pay(float cost)
      {
		if( us.W.balance>=cost)	
		{
    	   us.W.balance = us.W.balance-cost ;
    	  return "Payment is successful";
		}
		else 
		{
			return "balance in the wallet is not Enougth" ;
		}
			
      }
}
	
