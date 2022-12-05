package software;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Mobile extends Services
{
	private float cost ;
	public List<String> mobile_list = new ArrayList<>(Arrays.asList(
		    "We",
		    "Vodafone",
		    "Etisalate",
		    "Orange"
		));
	public Mobile() {
		//description = "Mobile";
	}
	public float cost() 
	{
		return cost;
	}
	
	public void setcost(float cost) {
		// TODO Auto-generated method stub
		this.cost=cost ;
	}
	public MobileCompany createprovider()
	{
		Scanner sc1= new Scanner(System.in);
				 System.out.println("Mobile Servicer is: ");
				 System.out.println(mobile_list);
				  // Scanner sc1=new Scanner()) ;
				String str2=sc1.next();
				 if(str2.equals("We"))
				 {
					 //Form form=new Form() ;
					 return new WeMobile() ;
					
				 }
				 else if (str2.equals("Etisalate"))
			    {
					 Form form=new Form() ;
					 return  new EtisalatMobile() ;
					
				}
				 else if (str2.equals("Vodafone"))
				 {
					 Form form=new Form() ;
					return new VodafoneMobile() ;
				 }
				 else if (str2.equals("Orange"))
				 {
					 Form form=new Form() ;
				    return new OrangeMobile() ;
					
					
				 }
				 return null ;
	}
	
}
