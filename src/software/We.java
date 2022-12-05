package software;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class We implements InternetCompany
{

	 private float cost=500 ;
	 We()
		{
			
		}
	public void handleForm(Form f) 
	{
		System.out.println("The saved data is :");
		for(Fields fi :f.list) {
			 System.out.print(fi.fieldname+"--->");
			 System.out.println(fi.content);
			  
		 }
	}
	 public Float getcost()
     {
     	return cost ;
     }

		public void provideForm(Form form) {
			// TODO Auto-generated method stub
			form.setForm_name("We");
			System.out.println("Enter your name: ");
			Fields field1=new TxtField();
			form.list.add(field1);
			System.out.println("Enter your address: ");
			Fields field2=new TxtField();
			form.list.add(field2);
			System.out.println("Enter your Phone: ");
			Fields field3=new NumericField();
			form.list.add(field3);
		}
}
