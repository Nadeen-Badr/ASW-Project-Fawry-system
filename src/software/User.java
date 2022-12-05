package software;

import java.util.Scanner;

public class User 
{

 public  String Username ;
 public String name ;
 public int transaction=0 ;

Wallet w = new Wallet();
PaymentStartegy payment ;

public String password;
public Object accountList;

public Form fillform(Form j) {
	 
	 System.out.println("----------------------------------- ");
	 System.out.println(j.getForm_name());
	// System.out.println("----------------------------------- ");
	 System.out.println("Fill the form ");
	 for(Fields fi :j.list) {
		 System.out.println(fi.fieldname);
	 }
	 System.out.println("------------------------------------ ");
	 for(Fields fi :j.list) {
		 System.out.println(fi.fieldname);
		  Scanner sc=new Scanner(System.in);
		  fi.content=sc.next();
	 }
	 return j;
	 
}
public void settransaction()
{
	transaction++;
}
public void setPaymenStrategy(PaymentStartegy pt) 
{
        this.payment=pt ;
}	
public int choose(int num)
{
     
	return num ;
	 
}


}

