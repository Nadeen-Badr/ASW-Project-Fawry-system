package com.example.demo.Providers;

//import Form.Form;

//import Payment.Form.Form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonthlyReceipt implements ServiceProvider
{
    String name="MonthlyReceipt";
    String type="Landline";
    public List<String>  Monthform = new ArrayList<>(Arrays.asList(
            "numberphone",
            "amount"));
    private float cost = (float) .01;
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

    public List<String> getform() {
        return Monthform ;
    }


}
