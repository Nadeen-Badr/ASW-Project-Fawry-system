package software;

import java.util.Scanner;


public class Vodafone implements InternetCompany 
{
	float cost=1000;

	public void handleForm(Form f) 
	{
		System.out.println("The saved data is :");
		for(Fields fi :f.list) {
			 System.out.print(fi.fieldname+"--->");
			 System.out.println(fi.content);
			  
		 }
	}

	public void provideForm(Form f) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		
		  
		System.out.println("Enter form name : ");
		
		 String name=sc.next();
		 f.setForm_name(name);
		 TxtField t=new TxtField();

		 System.out.println("Enter number of phone : ");
		 t.fieldname=sc.next();
		 f.list.add(t);
		 
		 System.out.println("Enter number of text fileds : ");
		 int filedno=sc.nextInt();
		 for(int i=0;i<filedno;i++) {
			 System.out.println("Enter name of text fileds : ");
			 t.fieldname=sc.next();
			 f.list.add(t);
		 }
		 System.out.println("Enter number of numeric fileds : ");
		 int tfiledno=sc.nextInt();
		 for(int i=0;i<tfiledno;i++) {
			 NumericField nf=new NumericField(); 
			 System.out.println("Enter number of numeric filed name : ");
			 nf.fieldname=sc.next();
			 f.list.add(nf);
		 }
		 
		 System.out.println(f.getForm_name());
		 for(Fields fi :f.list) {
			 System.out.println(fi.fieldname);
		 }
		 
	}
	@Override
	public Float getcost() 
	{
		return cost ;
	}
	

}
