package software;

public class Authentification
{

	Accounts ac=new Accounts() ;
	  public User check(String name ,String pass)
	   {
		    User obj = ac.getAccount(name) ;
		    if(obj==null)
		    {
		       return null  ;
		    }	
		    else 
		    {
		    	 // System.out.print(obj.Username); 
		    	if(obj.password.equals (pass))
		    	{
		    		
		    		return obj;
		    	}
		    	else 
		    		return null;
		   
		   }    
	   }
	  public boolean checkname (String name)
	     {
	    	 for (User ac:Accounts.accountList)
	    	 {
	    		 if(ac.Username.equals(name))
	    		 { 
	    			 return false ;
	    		 }
	    	
	    	 }
			return true;
	    	 
	     };
	  public User login(String name ,String pass)
	  { 
		  User obj=check(name,pass);
		  if(obj==null)
		  {
		  return null ;
		  }
		  else 
		  {
			  return obj ;
		  }  
	  } 
	  public void signUp(String name ,String pass)
	  {
		  if(checkname(name))
		  {
			  Accounts account = new Accounts();
			  User newuser=new User() ;
			 newuser.Username=name ;
			 newuser.password=pass ; 
			  System.out.println("Account id created" );
			   account.addaccount(newuser) ;
		  }
		  else 
			  System.out.println("please enter another name" ); 
	  }
}
