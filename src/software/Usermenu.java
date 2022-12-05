package software;
import java.util.HashMap;
import java.util.Scanner;

public class Usermenu 
{
	Scanner sc1= new Scanner(System.in);
	  User user ;
    // Authentification auth=new   Authentification();
	  public Usermenu(User us ,int check)
	  {
			this.user=us;
			if (check==1)  
			{ 
				RequestRefund()	 ;	
			}
			else if (check==2)
			{
			    AddtoWallet() ;	    
			}
			else if (check==3)
			{
				SearchaboutServices() ;
			}	
			else if (check==4)
			{
				PayServices() ;
			}
			else if (check==5)
			{
				Checkdiscounts () ;
			}
	}
	   public  void RequestRefund()
	    {
	    	Scanner sc= new Scanner(System.in);
			System.out.println("Enter amount");
	        float amount=sc.nextFloat();
	        System.out.println("Enter service");
	        String service=sc.next();
	        boolean flag=false ;
			for (PaymentList b : PaymentList.paymentList)
			   {
				if(b.getservice().equals(service) &&b.getcost().equals(amount) &&b.getname().equals(user.Username))
				{
					Refund newrefund=new Refund(service,amount ,user) ;
					 System.out.println("Yourrequest is sent ");
					  RefundList.addrefund(newrefund);
					  flag=true ;
					 
				}
			   }
			if(flag==false)
			{
				System.out.println("Your Refund don't mactch any service ");
			}
	      
	    }
	  public  void AddtoWallet()
	    {
	    	Scanner sc1= new Scanner(System.in);
			System.out.println("Enter name");
	        String name=sc1.next();
	        Scanner sc= new Scanner(System.in);
			System.out.print("Enter cvv");
			Integer cvv=sc.nextInt();
			Scanner sc11= new Scanner(System.in);
			System.out.println("Enter how much do you want to add?");
	        float amount=sc11.nextFloat();
	        user.w.addbalance(amount);
	        System.out.println("YourTransaction is success wallet now id "+user.w.balance);
	    }
	   public static void SearchaboutServices()
	    {
			 System.out.println("Enter Services You want(Mobile , Internet ,landlineService , Donations): ");
			 Scanner sc=new Scanner(System.in);
			 String type=sc.next();
			 if(type.equals("Mobile"))
			 {
				 Mobile m=new Mobile() ;
				 System.out.println("Mobile Servicer is: ");
				 System.out.println( m.mobile_list);
				  
			 }
			 else if(type.equals("Internet"))
			 {
				Internet m=new Internet() ;
				 System.out.println("Internet Servicer is: ");
				 System.out.println( m.internet_list);
			 }
			 else if(type.equals("landlineService")){
				 LandlineService m=new LandlineService() ;
				 System.out.println("landlineService Servicer is: ");
				 System.out.println(m.Landline_list);
			 }
			 else if(type.equals("Donations"))
			 {
				 Donations m=new Donations() ;
				
				 System.out.println("Donations Servicer is: ");
				 System.out.println(m.Donations_list);
			 }
			 else{
				 System.out.println("Sorry Wrong Services ");
			 }
	    }
	   public  PaymentList chooseServices()
	   {
		   PaymentList paymentlist=new PaymentList() ; 
		   Scanner sc1= new Scanner(System.in);
		   System.out.println(" you want pay which service ?Mobile , Internet , LandLine , Donations");
		   String str1=sc1.next();
		   paymentlist.setservice(str1) ;
		  
		   float cost = 0 ;
		   
		   if (str1.equals("Mobile"))
		   {
			   DiscountBehaviour dicount_behaviour1 = null;
		        Form form=new Form() ;
			    Mobile m=new Mobile() ;
			   MobileCompany obj= m.createprovider();
			   obj.provideForm(form);
			    form=user.fillform(form) ;
				 obj.handleForm(form);   
				   m.setcost(obj.getcost());
				   cost=m.cost() ;
					System.out.println( " Mobile Servecies= " + cost);
					 dicount_behaviour1=m;
					 boolean flag=false ;
						for (String i :Specific.discounts.keySet()) 
						{
								if(i.equals(str1))
								{
									flag=true ;
								}
							  
			            }
							if(flag==true)
							{
					    	  dicount_behaviour1=new Specific(dicount_behaviour1,str1);
						      cost =dicount_behaviour1.cost() ;
					          System.out.println(  "Servecies after dicount Specific= " + cost);
					          flag=false ;
							}	
						for(int i :Overall.disoverall.keySet())
						{	
						    if (user.transaction==i)
						    {
						    	flag=true  ;
						    }
						    if (flag==true)
						    {
						     dicount_behaviour1=new Overall(dicount_behaviour1,user.transaction);
						     System.out.println(dicount_behaviour1.cost() );
						      //cost = dicount_behaviour1.cost() ;
					          //System.out.println(" itnernet Servecies after dicount Specific= " + cost);
						    }
						}
						
	   }

		   
		   else if (str1.equals("Internet") )
				  {
			   DiscountBehaviour dicount_behaviour1 = null;
					 Form form=new Form() ;
					Internet net=new Internet() ;
					InternetCompany obj=net.createprovide();
					obj.provideForm(form);
					 form=user.fillform(form) ;
					 obj.handleForm(form);
					 net.setcost(obj.getcost());
					   cost=net.cost() ;
						System.out.println( " Internet Servecies= " + cost);
						 dicount_behaviour1=net;
						
						 boolean flag=false ;
							for (String i :Specific.discounts.keySet()) 
							{
									if(i.equals(str1))
									{
										flag=true ;
									}
								  
				            }
								if(flag==true)
								{
						    	  dicount_behaviour1=new Specific(dicount_behaviour1,str1);
							      cost =dicount_behaviour1.cost() ;
						          System.out.println(  "Servecies after dicount Specific= " + cost);
						          flag=false ;
								}	
							for(int i :Overall.disoverall.keySet())
							{	
							    if (user.transaction==i)
							    {
							    	flag=true  ;
							    }
							    if (flag==true)
							    {
							     dicount_behaviour1=new Overall(dicount_behaviour1,user.transaction);
							     System.out.println(dicount_behaviour1.cost() );
							    }
							}
				
		   }
		   
		   
 else if (str1.equals("LandLine"))
{
	 DiscountBehaviour dicount_behaviour1 = null;
	 LandlineService land=new LandlineService() ;
	 Form form=new Form() ;
	 LandLineCompany obj=land.createprovide() ;
	obj.provideForm(form);
	 form=user.fillform(form) ;
	 obj.handleForm(form);
	 land.setcost(obj.getcost());
	   cost=land.cost() ;
		System.out.println( " LandLine Servecies= " + cost);
		 dicount_behaviour1=land;
		
		 boolean flag=false ;
			for (String i :Specific.discounts.keySet()) 
			{
					if(i.equals(str1))
					{
						flag=true ;
					}
				  
         }
				if(flag==true)
				{
		    	  dicount_behaviour1=new Specific(dicount_behaviour1,str1);
			      cost =dicount_behaviour1.cost() ;
		          System.out.println(  "Servecies after dicount Specific= " + cost);
		          flag=false ;
				}	
			for(int i :Overall.disoverall.keySet())
			{	
			    if (user.transaction==i)
			    {
			    	flag=true  ;
			    }
			    if (flag==true)
			    {
			     dicount_behaviour1=new Overall(dicount_behaviour1,user.transaction);
			     System.out.println(dicount_behaviour1.cost() );
			    }
			}
			
}
else if (str1.equals("Donations"))
{
	
	 DiscountBehaviour dicount_behaviour1 = null;
	 Donations d=new Donations() ;
	 Form form=new Form() ;
	DonationsCompany obj=d.createprovider() ;
	obj.provideForm(form);
	 form=user.fillform(form) ;
	 obj.handleForm(form);
	 d.setcost(obj.getcost());
	   cost=d.cost() ;
		System.out.println( " LandLine Servecies= " + cost);
		 dicount_behaviour1=d;
		 boolean flag=false ;
			for (String i :Specific.discounts.keySet()) 
			{
					if(i.equals(str1))
					{
						flag=true ;
					}
				  
         }
				if(flag==true)
				{
		    	  dicount_behaviour1=new Specific(dicount_behaviour1,str1);
			      cost =dicount_behaviour1.cost() ;
		          System.out.println(  "Servecies after dicount Specific= " + cost);
		          flag=false ;
				}	
			for(int i :Overall.disoverall.keySet())
			{	
			    if (user.transaction==i)
			    {
			    	flag=true  ;
			    }
			    if (flag==true)
			    {
			     dicount_behaviour1=new Overall(dicount_behaviour1,user.transaction);
			     System.out.println(dicount_behaviour1.cost() );
			    }
			}

}
		   
		   
		   
			
		paymentlist.setcost(cost) ;
		return paymentlist;
	   }
					
	   public  void PayServices()
	   {
		   boolean flag=true ;
		 PaymentList payment=chooseServices() ;
		   Scanner sc1= new Scanner(System.in);
		   		   System.out.println(" you want pay cash,credit or by wallet");
		   String str=sc1.next();
		   if(str.equals("cash"))
		   {
			   PaymentStartegy cash= new Cashpayment() ;
			     user.setPaymenStrategy(cash);
			     user.payment.pay(payment.getcost())  ;
		   }
		   else if(str.equals("credit"))
		   {
			  PaymentStartegy credit= new  Creditcardpayment() ;
			     user.setPaymenStrategy(credit);
			    user.payment.pay(payment.getcost()) ;
			  
		   }
		   else if(str.equals("wallet"))
		   {
 
			     PaymentStartegy Wallet= new  Walletpayment(user) ;
			     user.setPaymenStrategy(Wallet);
			    flag=user.payment.pay(payment.getcost()) ;
			   
		   }
		    if(flag==true)
		    	user.settransaction() ;
		       payment.AddPayment(payment);
	
	   }
	   void Checkdiscounts ()
	   {
	   	for (String i :Specific.discounts.keySet()) 
	   	{
	   		 System.out.println(" we have discount on " + i+"Services" + " equal: " +Specific.discounts .get(i)+" %") ;
	   	}
	   	for (int i :Overall.disoverall.keySet()) 
	   	{
	   		 System.out.println(" we have overall discount to user that use system First time "+ "equal " +Specific.discounts .get(i)) ;
	   	}
	   	
	   	
	   }
}