package com.example.demo.Payment;



public class Transaction
{
    public String username;
    public String name;
    public String type;
    public float amount ;
 public  String PaymentMethod;

    public void setPaymentMethod(String paymentMethod)
    {
        PaymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public String getUsername()
    {
        return username;
    }
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }
    public float getAmount() {
        return amount;
    }

    
}
