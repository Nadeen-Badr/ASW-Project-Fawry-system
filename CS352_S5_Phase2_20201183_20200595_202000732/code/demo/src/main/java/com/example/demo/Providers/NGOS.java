package com.example.demo.Providers;

//import Form.Form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NGOS implements ServiceProvider
{
    String name="NGOS";
    String type="Donations";
  private final List<String>  NGOSform = new ArrayList<>(Arrays.asList(
            "PhoneNumber",
            "amount"));

    public HashMap<String,String> fields = new HashMap<String,String>(){{put("Mobile"," ");put("Donations"," ");}} ;
    private float cost = (float) .01;
   // Form form;
    public Float getcost()
    {
        // TODO Auto-generated method stub
        return cost;
    }

    public HashMap<String, String> getFields() {
        return fields;
    }

    @Override
    public String gettype() {
        return type;
    }
    public String getname() {
        return name;
    }
    public List<String> getform()
    {
        return NGOSform ;
    }

}
