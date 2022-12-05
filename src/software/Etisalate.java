package software;


//import java.awt.TextField;
import java.util.Scanner;
public class Etisalate implements InternetCompany{
	 private float cost=500 ;

	public void provideForm(Form f) {
		System.out.println("Enter form name : ");
		 Scanner sc=new Scanner(System.in);
		 String name=sc.next();
		 f.setForm_name(name);
		 System.out.println("Enter number of text fileds : ");
		 int filedno=sc.nextInt();
		 for(int i=0;i<filedno;i++) {
			 TxtField t=new TxtField();
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
	
	public void handleForm(Form f) {
		System.out.println("The saved data is :");
		for(Fields fi :f.list) {
			 System.out.print(fi.fieldname+"--->");
			 System.out.println(fi.content);
			  
		 }
	}
	public Float getcost() {
		// TODO Auto-generated method stub
		return null;
	}
	



	



}

