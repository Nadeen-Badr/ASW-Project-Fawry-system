package software;

import java.util.Scanner;

public class Creditcardpayment  implements PaymentStartegy
{
	public String name;
	public String cardnumber;
	public  int cvv;
 
 public  Creditcardpayment()
 {
	 Scanner sc11= new Scanner(System.in);
	   System.out.println("Enter name");
		String name=sc11.next();
		 System.out.println("Enter cardNumber");
	      String number=sc11.next();
		System.out.print("Enter cvv");
		  int cvv=sc11.nextInt();
			//super();
			this.name = name;
			this.cardnumber = number;
			this.cvv=cvv;
  }
 public boolean pay(float cost)
 {
	 System.out.println("Payment is successful");
	return true;
 } 
 

}
