package com.example.demo.Providers;

//import Form.Form;

import java.util.List;

public class Orange implements ServiceProvider
{

    String name="Orange";
    String type="Internet";
    private float cost=(float) .01;
    //Form form ;
    public Float getcost()
    {
        // TODO Auto-generated method stub
         return cost ;
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
