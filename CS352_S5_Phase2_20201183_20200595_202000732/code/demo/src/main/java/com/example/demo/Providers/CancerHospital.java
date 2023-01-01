package com.example.demo.Providers;

//import Form.Form;

//import Payment.Form.Form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CancerHospital implements ServiceProvider
{
    String name="CancerHospital";
    String type="Donations";

    private float cost = (float) 0.1;
    public Float getcost()
    {
        return cost;
    }
    @Override
    public String gettype() {
        return type;
    }

    @Override
    public String getname()
    {
        return name;
    }


}
