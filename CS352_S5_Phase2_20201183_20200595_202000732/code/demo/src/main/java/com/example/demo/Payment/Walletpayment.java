package com.example.demo.Payment;

import com.example.demo.User.UserControl;

public class Walletpayment implements PaymentStartegy
{


      public Boolean  pay(float cost)
      {
		if( UserControl.currentu.getW().getbalance()>=cost)
		{
			UserControl.currentu.getW().setBalance(UserControl.currentu.getW().getbalance() - cost) ;
    	  return true ;
		}
		else 
		{
			return false ;
		}
			
      }

}
	
