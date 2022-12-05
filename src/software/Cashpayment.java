package software;

import java.util.Scanner;

public class Cashpayment implements PaymentStartegy
{
	public Cashpayment()
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your Address");
		   String addrress=sc.next();
	}
	
public boolean pay(float cost) 
{
	 System.out.println("Payment is successful");
	 return true ;
	
}
}