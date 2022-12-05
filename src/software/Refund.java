package software;

public class Refund {



float amount=0;
String Service=" ";
//Wallet w=new Wallet();
User user ;
boolean state;
public Refund(String Service ,float amount ,User us)
{
	this.Service=Service ;
	this.amount=amount ;
   this.user= us ;
	//rl.addrefund(new);	
}
public Refund(Refund newrefund) 
{
	// TODO Auto-generated constructor stub
}
/*
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public String getReason() {
	return Reason;
}
public void setReason(String reason) {
	Reason = reason;
}

public boolean isState() 
{
	return state;
}
public void setState(boolean state) 
{
	this.state = state;
}
*/
public void RejectRefund()
{
	System.out.println("Sorry, yourRefund is rejected ");

}
public void AcceptRefund()
{
	System.out.println("Balance in wallet is"+user.w.balance);
 	user.w.balance=user.w.balance+ amount;	
 	System.out.println("Now ,Balance in wallet is"+user.w.balance); 	
}
}
