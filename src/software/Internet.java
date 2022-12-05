package software;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Internet extends Services{

	Float cost=(float) 100 ;
	public  List<String> internet_list = new ArrayList<>(Arrays.asList(
		    "We",
		    "Vodafone",
		    "Etisalate",
		    "Orange"
		)); 
	public float cost() 
	{
		return cost;
	}
	
	public void setcost(float cost) {
		// TODO Auto-generated method stub
		this.cost=cost ;
	}
	
	public InternetCompany createprovide()
	{
		Scanner sc1= new Scanner(System.in);
		Internet net =new Internet() ;
		 System.out.println("Internet Servicer is: ");
		 System.out.println(net.internet_list);
		   String str2=sc1.next();
		  
		 if(str2.equals("We"))
		 {
			return new We() ;
			
			
			
		 }
		 else if (str2.equals("Etisalate"))
				 {
			
			 return new Etisalate() ;
			
				 }
		 else if (str2.equals("Vodafone"))
		 {
			 return new Vodafone() ;
			
		 }
		 else if (str2.equals("Orange"))
		 {
			
			return new Orange() ;
			
		 }
		return null;
	}
}
