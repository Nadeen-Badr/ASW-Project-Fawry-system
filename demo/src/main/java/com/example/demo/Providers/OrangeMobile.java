package com.example.demo.Providers;

//import Form.Form;

public class OrangeMobile implements ServiceProvider
{
    String name;
    String addresss;
    float amount;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddresss() {
        return addresss;
    }
    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    private float cost = 500;
    //Form form;
    public Float getcost()
    {
        // TODO Auto-generated method stub
        return cost;
    }
}
