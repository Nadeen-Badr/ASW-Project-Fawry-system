package software;

public class Walletpayment implements PaymentStartegy
{
	User us ;
	Walletpayment(User us)
	{
		this.us=us ;
	}
	@Override
      public boolean pay(float cost)
      {
		if( us.w.balance>=cost)	
		{
    	   us.w.balance = us.w.balance-cost ;
    	   System.out.println("Payment is successful");
    	   return true ;
    	   
		}
		else 
		{
			System.out.println("balance in the wallet is not Enougth");
			return false ;
		}
			
      }
}
	
