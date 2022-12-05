package software;


public class MonthlyReceipt implements LandLineCompany
{
	
	Float cost=(float) 500;

	public void handleForm(Form f) {
		System.out.println("The saved data is :");
		for(Fields fi :f.list) {
			 System.out.print(fi.fieldname+"--->");
			 System.out.println(fi.content);
			  
		 }
	}

	//satatic
		public void provideForm(Form f) {
			// TODO Auto-generated method stub
			f.setForm_name("MonthlyReceipt");
			System.out.println("Enter your name: ");
			Fields field1=new TxtField();
			f.list.add(field1);
			System.out.println("Enter your address: ");
			Fields field2=new TxtField();
			f.list.add(field2);
			System.out.println("Enter your Phone: ");
			Fields field3=new NumericField();
			f.list.add(field3);
		}
		@Override
		public float getcost()
		{
			 return cost ;
		}
}