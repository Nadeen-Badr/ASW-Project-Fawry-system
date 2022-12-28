package com.example.demo.Providers;

//import Form.Form;

public class Orange implements ServiceProvider
{
    String name;
    String address;
    float amount;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    private float cost=500 ;
    //Form form ;
    public Float getcost() {
        // TODO Auto-generated method stub
        return cost ;
    }

}
