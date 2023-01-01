package com.example.demo.Discount;

import org.springframework.web.bind.annotation.*;

import com.example.demo.Providers.Service;

import java.util.HashMap;

@RestController
public class DiscountController
{
    Overall overalldiscount=new Overall() ;
    Specific specific=new Specific() ;
    @RequestMapping(value = "/AddSoeceficDiscount", method = RequestMethod.POST)
    public String addOverallDiscount(@RequestParam("Service")String service ,@RequestParam("percentage")float percentage)
    {
        specific.Addspecific(service,percentage) ;
        return "Success Add Spicific Discont";
    }
    @RequestMapping(value = "/AddOverallDiscount", method = RequestMethod.POST)
    public String addSpeceficDiscount(@RequestParam("Transation")int transaction ,@RequestParam("percentage")float percentage)
    {
        overalldiscount.AddOverall(transaction,percentage) ;
        return "Success Add Spicific Discont";
    }
   public float Creatediscount(Service service)
   {
       DiscountDecorator service_cost = new Overall(new Specific(service));
       return service_cost.getcost() ;
   }

    @RequestMapping(value = "/checkOverallDiscount", method = RequestMethod.GET)
    public HashMap<Integer, Float> Checkdiscounts()
    {
        HashMap<Integer, Float> disoverall = overalldiscount.ReturnDisoverall() ;
        return disoverall ;
    }

    @RequestMapping(value = "/checkSpeceficDiscount", method = RequestMethod.GET)
    public HashMap<String, Float> checkSpeceficDiscount()
    {
        HashMap<String, Float> disoverall = specific.ReturnDisSpecefic();
        return disoverall ;
    }



}