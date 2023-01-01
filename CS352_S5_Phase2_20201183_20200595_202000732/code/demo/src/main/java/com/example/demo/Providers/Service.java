package com.example.demo.Providers;


import com.example.demo.Discount.DiscountBehaviour;
import com.example.demo.Payment.PaymentStartegy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service  implements DiscountBehaviour {
    String sname;
    float cost ;
    private PaymentStartegy paymentStartegy;
   public  void setpayment(PaymentStartegy paymentStartegy)
   {
       this.paymentStartegy=paymentStartegy;

   };
    public Service() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

  public List<ServiceProvider>providers =new ArrayList<>(Arrays.asList(   new NGOS() ,new CancerHospital() ,new Etisalate(),new EstisalteMobile(),new We(), new WeMobile() ,new VodafoneMobile(),new Vodafone(),new QuarterReceipt() ,new Orange() ,new OrangeMobile(),new MonthlyReceipt() , new Schools()  )) ;

    public List<ServiceProvider> getProviders()
    {
        return providers;
    }

    @Override
    public float getcost() {
        return cost;
    }
public void Addprovider(ServiceProvider newprovider)
{
    providers.add(newprovider) ;
}

}
