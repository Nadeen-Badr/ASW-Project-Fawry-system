package software;

import java.io.InputStream;
import java.util.Scanner;
public class Main 
{
	 //Scanner sc = new Scanner(InputStream in);
	public static int Amenu()
	{
	  System.out.println("1-Add new discount "); 
	  System.out.println("2-check list of refunds "); 
	  Scanner n= new Scanner(System.in);
		Integer num=n.nextInt() ;
		return num ;
	}
	public static int umenu()
	{
		System.out.println("-choose num"); 
		  System.out.println("1-request refund : "); 
		  System.out.println("2-add to the Wallet: "); 
		  System.out.println("3-Search about service: "); 
		  System.out.println("4-pay service: "); 
		  System.out.println("5-Check Discount: "); 
		  System.out.println("6-log out: "); 
		  Scanner n= new Scanner(System.in);
			Integer num=n.nextInt() ;
			return num ;
	}
		public static void main(String[] args)
		{
			System.out.println("Welcome in Fawry system");
			 Scanner sc1= new Scanner(System.in);
			 Scanner sc =new Scanner(System.in);
			 
			 while (true)
		     {
		    	 System.out.println("Are you user or Admin chosse");
				 System.out.println("1:user   2:admin"); 
				 Scanner sc11 =new Scanner(System.in);
				 Integer num =sc11.nextInt();
		    	 Scanner sc111= new Scanner(System.in);
				 if (num==1)
				 {
					 User user=new User();
					 while (true)
					 {
				    	
				    	 System.out.println("1-log in the system: "); 
			   		     System.out.println("2-sign up : "); 
			   		       Scanner n= new Scanner(System.in);
			   		       Integer num1=n.nextInt() ;
			   		     System.out.print("Enter a string: ");  
			   	    	  String name= n.next();
			   			 Scanner pass= new Scanner(System.in); 
			   	    	  System.out.print("Enter password: ");  
			   	    	  String password= pass.next();	  
			   	    	Authentification au =new  Authentification() ;
			   		       if (num1==1)
			   		       {
			   		       user=au.login(name,password) ;
			   		       if(user==null)
			   		       {
			   		    	  System.out.println("please makeusre pass and name" );  
			   		       }
			   		       else
			   		       {
			   		    	 System.out.println("log in is done,Welcome"+user.Username ); 
			   		    	 break;
			   		       }
			   		       }
			   		       else if (num1==2)
			   		       {
			   		    	   au.signUp(name,password) ;   
			   		    	   user=au.login(name,password) ;
			   		       }
			   		       else 
			   		       {
			   		    	System.out.println("Wronge input ");
			   		       }
					 }
				    	 while(true) 
				    		 {
				   		        int  choice=umenu() ; 
				    		    if (choice==6)
				    		    {
				    			   break ;
				    		    }
				    		    else 
				    		    {
									Usermenu um=new Usermenu(user,user.choose(choice));
				    		    }
			
				               }
				 }
				 else if (num ==2)
				 {
					 Admin admin=new Admin() ;
					 int choose=Amenu() ;
					 Adminmenu admenu=new  Adminmenu(admin,admin.choose(choose)) ;
					 
					 
				 }
				 
			
		     }
		}
}	
		




			 
	

