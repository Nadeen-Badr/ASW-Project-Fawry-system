package software;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Donations extends Services
{
	public float cost ;
	public List<String> Donations_list = new ArrayList<>(Arrays.asList(
		    "Cancer Hospital",
		    "Schools",
		    "NGOs"
		));
	public float cost() 
	{
		return cost;
	}
	
	public void setcost(float cost) {
		// TODO Auto-generated method stub
		this.cost=cost ;
	}
	public DonationsCompany createprovider()
	{
		
		Scanner sc1= new Scanner(System.in);
		 System.out.println("Donations Servicer is: ");
		 System.out.println(Donations_list);
		 String str2=sc1.next();
		 if(str2.equals("Cancer"))
		 {
			
			
			 return new cancerHospital() ;
		
			 
		 }
		 else if (str2.equals("Schools"))
		 {
		
			 return new Schools() ;
			
		 }
		 else if (str2.equals("NGOs"))
		 {
		  return new NGOS() ;
			 
		 }
		 return null ;
	}
	
}