package software;


import java.util.Scanner;

public class Adminmenu 
{
	Admin admin ;
	Adminmenu()
	{}
	Adminmenu (Admin admin ,int num)
	{
	this.admin=admin ;
	choose(num) ;
	
	}
	void Adddiscout()
	{
		System.out.println(" You Want To add overall discount or speceific discount  1-Overall  2- Specefic");
		 Scanner n= new Scanner(System.in);
		int num=n.nextInt() ;
		if(num==1)
		{
			System.out.println("How many Transaction you will add?");
			int  transaction =n.nextInt() ;
			System.out.println("what percentage ?");
			float percentage=n.nextFloat() ;
			Overall.AddOverall(transaction,percentage) ;
		}
		else if (num==2)
		{
			System.out.println("which services you want to add");
			String service=n.next() ;
			System.out.println("what percentage ?");
			float percentage=n.nextFloat() ;
			Specific.Addspecific(service,percentage) ;
		}
			 
	}
void checklist()
{
	if(admin.rel.list.size()==0){
		System.out.println("No Refund ");
	}
	else{
	
	for ( Refund re:admin.rel.list)
	{
		System.out.println(re.Service);
	    System.out.println(re.amount);
		System.out.println("Do You Want To Accpet This Refund? 1-yes 2-No");
		 Scanner n= new Scanner(System.in);
			Integer num1=n.nextInt() ;
			if(num1==1)
				re.AcceptRefund();
			else 
				re.RejectRefund();
	    
	}
	}
}
public void choose(int num)
{
	if(num==1)
	{
		Adddiscout() ;
	}
	else 
	{
		checklist() ;
	}
}
}

