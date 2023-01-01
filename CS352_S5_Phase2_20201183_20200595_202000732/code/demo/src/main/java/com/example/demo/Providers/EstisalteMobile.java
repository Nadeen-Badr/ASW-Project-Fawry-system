package com.example.demo.Providers;

//import Form.Form;

//import Payment.Form.Form;

import java.util.List;

public class EstisalteMobile implements ServiceProvider
{
    String name="EstisalteMobile";
    String type="Mobile";
    private float cost = (float) 0.10;
    //Form form;
    public Float getcost()
    {
        // TODO Auto-generated method stub
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

}
