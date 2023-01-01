package com.example.demo.Providers;

//import Form.Form;

//import Payment.Form.Form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Schools implements ServiceProvider
{
    public String getName() {
        return name;
    }

    String name="Schools";
    String type="Donations";


    private float cost = (float) 0.30;

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



}
