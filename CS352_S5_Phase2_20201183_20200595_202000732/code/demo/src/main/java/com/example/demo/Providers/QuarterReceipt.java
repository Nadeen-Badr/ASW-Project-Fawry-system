package com.example.demo.Providers;

//import Form.Form;

//import Payment.Form.Form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuarterReceipt implements ServiceProvider
{
    String name="QuarterReceipt";
    String type="Landline";
    public List<String>  Quarterform = new ArrayList<>(Arrays.asList(
            "PhoneNumber",
            "amount","Zibcode"));
    private float cost = (float) 0.03;

    public Float getcost()
    {
        // TODO Auto-generated method stub
        return cost;
    }

    @Override
    public String gettype()
    {
        return type;
    }

    @Override
    public String getname() {
        return name;
    }

    public List<String> getform()
    {
        return Quarterform;
    }
}
