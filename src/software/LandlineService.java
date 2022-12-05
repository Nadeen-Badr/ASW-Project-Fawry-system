
package software;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class LandlineService extends Services
{
	float cost;
	 public List<String> Landline_list = new ArrayList<>(Arrays.asList(
			    "Monthly receipt",
			    "Quarter receipt"));
	 public float cost() 
		{
			return cost;
		}
		
		public void setcost(float cost) {
			// TODO Auto-generated method stub
			this.cost=cost ;
		}
	public LandLineCompany createprovide()
	{

		Scanner sc1= new Scanner(System.in);
		 System.out.println("LandLineservices is: ");
		 System.out.println(Landline_list);
		 String str2=sc1.next();
		 if (str2.equals("Monthly"))
		 {
			return new MonthlyReceipt() ;
			
			
		 }
		 else if (str2.equals("Quarter"))
		 {
			   
			 return new QuarterReceipt() ;
	
		 }
		
		return null;
	}
	
}