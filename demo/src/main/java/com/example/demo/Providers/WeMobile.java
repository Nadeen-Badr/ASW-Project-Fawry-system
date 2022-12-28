package com.example.demo.Providers;

//import Form.Form;

//import Payment.Form.Form;

public class WeMobile implements ServiceProvider
{
    String name;
    float amount;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    private float cost = 500;
   // Form form;
    public Float getcost()
    {
        // TODO Auto-generated method stub
        return cost;
    }
}
