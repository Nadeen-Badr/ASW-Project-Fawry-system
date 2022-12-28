package com.example.demo.Providers;

//import Form.Form;

//import Payment.Form.Form;

public class Etisalate implements ServiceProvider
{
    String name;
    String phone;
    float amount;
    

    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /* 
    String name="Etisalate";
    String type="Internet";*/
    private float cost = 500;
    //Form form;
    public Float getcost()
    {
        // TODO Auto-generated method stub
        return cost;
    }
}