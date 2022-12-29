package com.example.demo.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentList
{
  private  String service ;
  private  Float cost ;
  private String name ;
  public void setname(String n)
  {
	  name=n;
  }
  public void setservice(String s)
  {
	 service=s;
  }
    
  public void setcost(Float c)
  {
	 cost=c ;
  }
    
  public String getname()
  {
	 return name ;
  }
  public String getservice()
  {
	return service ;
  }
    
  public Float getcost()
  {
	 return cost ;
  }
	public static List<PaymentList> paymentList= new ArrayList<PaymentList>();
	public  static void AddPayment(PaymentList py)
	{
		paymentList.add(py) ;
	}
	   
}

