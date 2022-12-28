package com.example.demo.Providers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service {
    String sname;
    
    public Service() {
    }
    
    public Service(String sname) {
        this.sname = sname;
    }

    public Service(String sname, List<String> l, List<String> d, List<String> i, List<String> m) {
        this.sname = sname;
        this.l = l;
        this.d = d;
        this.i = i;
        this.m = m;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<String> l = new ArrayList<>(Arrays.asList(
			    "Monthly receipt",
			    "Quarter receipt"));
    public List<String> d = new ArrayList<>(Arrays.asList(
		    "Cancer Hospital",
		    "Schools",
		    "NGOs"));
    public  List<String> i = new ArrayList<>(Arrays.asList(
                "We",
                "Vodafone",
                "Etisalate",
                "Orange"
            )); 
    public List<String> m= new ArrayList<>(Arrays.asList(
                "We",
                "Vodafone",
                "Etisalate",
                "Orange"
            ));

}
