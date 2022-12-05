package software;

public class NGOS implements DonationsCompany
{
	float cost;


	public void provideForm(Form f) {
		// TODO Auto-generated method stub
		f.setForm_name("NGOS Form: ");
		System.out.println("Enter your name: ");
		Fields field1=new TxtField();
		f.list.add(field1);
		System.out.println("Enter your address: ");
		Fields field2=new TxtField();
		f.list.add(field2);
		System.out.println("Enter your Phone: ");
		Fields field3=new NumericField();
		f.list.add(field3);
		System.out.println("Enter Name of Organization: ");
		Fields field4=new TxtField();
		f.list.add(field4);
	}

	public void handleForm(Form f) {
		System.out.println("The saved data is :");
		for(Fields fi :f.list) {
			 System.out.print(fi.fieldname+"--->");
			 System.out.println(fi.content);
			  
		 }
	}

	@Override
	public void setcost(float cost)
	{
		this.cost=cost ;
	}
	public float getcost() 
	{
		return cost ;

  } 
}