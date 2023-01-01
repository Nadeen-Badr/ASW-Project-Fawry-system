package com.example.demo.Providers;

//import Form.Form;

//import Payment.Form.Form;

import java.util.List;

public class WeMobile implements ServiceProvider
{
    String name="WeMobile";
    String type="Mobile";
    private float cost = (float) .02;
   // Form form;
    public Float getcost()
    {

        return cost;
    }

    @Override
    public String gettype() {
        return type;
    }

    @Override
    public String getname() {
        return name;
    }

    public List<String> getform() {
        return null;
    }
}
