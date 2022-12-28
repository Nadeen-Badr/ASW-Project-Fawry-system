package com.example.demo.Providers;


import java.util.List;
//import java.util.Scanner;

//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class ProviderController {
         
@RequestMapping(value ="/search", method = RequestMethod.POST)
   public List <String> searchresult(@RequestBody Service s){
        //String searchresult(@RequestBody Service s){
           //str=Providersview.Searchin();
        if (s.sname.equals("Mobile"))

            return s.m;
            //return "Service.m;";
        else if (s.sname.equals("Internet"))
            return s.i;
        else if (s.sname.equals("LandLine"))
            return s.l;
        else if (s.sname.equals("Donation"))
            return s.d;
        else
            return null ;
    }


    }
    
    

