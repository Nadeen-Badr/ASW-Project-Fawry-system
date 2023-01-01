package com.example.demo.Providers;


import com.example.demo.Discount.DiscountController;
import com.example.demo.Payment.PaymentStartegy;
import com.example.demo.User.UserControl;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceController
{


    public ServiceProvider Createprovider(String Providername)
    {
        if (Providername.equals("NGOS"))
        {
           return new NGOS();

        }
        else if (Providername.equals("Schools"))
        {
            return new Schools();

        }
        else if (Providername.equals("CancerHospital"))
        {
            return new CancerHospital();

        }
        else if (Providername.equals("MonthlyReceipt"))
        {
            return new MonthlyReceipt();
        }

        else if (Providername.equals("QuarterReceipt"))
        {
            return new QuarterReceipt();
        }
        else if (Providername.equals("EtsalateMobile"))
        {
            return new EstisalteMobile();
        }
        else if (Providername.equals("Etisalate"))
            return new Etisalate() ;
        else if (Providername.equals("Orange"))
            return new Orange() ;
        else if(Providername.equals("OrangeMobile"))
            return  new OrangeMobile() ;
        else if (Providername.equals("Vodafone"))
            return new Vodafone() ;
        else if (Providername.equals("VodafoneMobile"))
            return  new VodafoneMobile() ;
        else if (Providername.equals("We"))
                   return new We() ;
        else if(Providername.equals("WeMobile"))
            return  new WeMobile() ;
        else
            return  null ;

    }
    Service service = new Service();

    @RequestMapping(value = "/calcalte_servic", method = RequestMethod.GET)
    public  float  calcalte_service(@RequestParam("Providername") String Providername, @RequestParam("amount") float amount)
    {
    ServiceProvider serviceProvider;
    serviceProvider=Createprovider(Providername) ;

        float cost;
        String type;
        cost =serviceProvider.getcost();
        type = serviceProvider.gettype();
        service.setCost((cost * amount) + amount);
        service.setSname(type);
       // DiscountDecorator service_cost=new  Specific(service) ;
        //DiscountDecorator service_cost=new Overall(service) ;
        //DiscountDecorator service_cost = new Overall(new Specific(service));   //
        DiscountController dis=new DiscountController() ;
        float servicecost=dis.Creatediscount(service) ;
        return  servicecost;
    }
    @RequestMapping(value="/search", method=RequestMethod.GET)
    List<String> search(@RequestParam ("Providername")  String name)
    {
       List <String> result =new ArrayList<>() ;
       for (ServiceProvider s:service.getProviders())
           if (s.gettype().equals(name))
           {
               result.add(s.getname()) ;
           }

        return  result ;
    }
    public void setpayment(PaymentStartegy paymentStartegy)
    {
        service.setpayment(paymentStartegy);
    }
   public void Addprovider(ServiceProvider newprovider)
   {
       service.Addprovider(newprovider) ;
   }

}
