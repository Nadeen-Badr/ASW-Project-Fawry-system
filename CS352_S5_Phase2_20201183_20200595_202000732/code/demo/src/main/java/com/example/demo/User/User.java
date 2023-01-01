package com.example.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
public class User
{
    String userName;
    String password;
    int numoftransaction =0;
   @Autowired
   private Wallet W ;
    public User()
    {
        W=new Wallet() ;
    }
    public int getNumoftransaction()
    {
        return numoftransaction;
    }
    public void setNumoftransaction(int numoftransaction)
    {
        this.numoftransaction = numoftransaction;
    }
    public Wallet getW()
    {
        return W;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
