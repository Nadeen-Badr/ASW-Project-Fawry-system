package software;


public class Orange implements InternetCompany
{

	float cost=700 ;
	
	public void handleForm(Form f) {
		System.out.println("The saved data is :");
		for(Fields fi :f.list) {
			 System.out.print(fi.fieldname+"--->");
			 System.out.println(fi.content);
			  
		 }
	}
	public void provideForm(Form f) {
		// TODO Auto-generated method stub
		f.setForm_name("Orange");
		System.out.println("Enter your name: ");
		Fields field1=new TxtField();
		f.list.add(field1);
		System.out.println("Enter your address: ");
		Fields field2=new TxtField();
		f.list.add(field2);
	}
	@Override
	public Float getcost() 
	{
		
		return cost;
	}

}