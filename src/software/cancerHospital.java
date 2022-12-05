package software;

public class cancerHospital implements DonationsCompany
{

 float cost =(float) 100.0;
	public void provideForm(Form f) {
		// TODO Auto-generated method stub
		f.setForm_name("Cancer Hospital Form: ");
		System.out.println("Enter Hospital's name: ");
		Fields field1=new TxtField();
		f.list.add(field1);
		System.out.println("Enter your Phone: ");
		Fields field3=new NumericField();
		f.list.add(field3);
		System.out.println("Enter Number of bank: ");
		Fields field4=new TxtField();
		f.list.add(field4);
	}
	public void handleForm(Form f) 
	{
		System.out.println("The saved data is :");
		for(Fields fi :f.list) 
		{
			 System.out.print(fi.fieldname+"--->");
			 System.out.println(fi.content);  
		 }
	}
	public float getcost() {
		// TODO Auto-generated method stub
		return 100;
	}
	public void setcost(float cost) {
		// TODO Auto-generated method stub
		this.cost=cost ;
	}
	
	
}
