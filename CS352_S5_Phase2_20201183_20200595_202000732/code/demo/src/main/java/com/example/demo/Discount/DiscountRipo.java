package com.example.demo.Discount;

import java.util.HashMap;

public class DiscountRipo
{
    public static HashMap<String, Float> discounts = new HashMap<String,Float>(){{put("Mobile",(float) 0.02);put("Donations",(float) .01);}} ;

    public static HashMap<Integer, Float> getDisoverall() {
        return disoverall;
    }

    public static HashMap<Integer, Float> disoverall = new HashMap<Integer,Float>(){{put(0,(float) .30);}} ;
    public float ReturnSpeceficDiscounts(String servicename)
    {
        for (String i :discounts.keySet())
        {
            if (i.equals(servicename))
            {
               return discounts.get(i) ;
            }
        }
        return 0;
    }
    public float ReturnOverallDiscounts( Integer num)
    {
        for (Integer i :disoverall.keySet())
        {
            if (i==num)
            {
                return disoverall.get(num) ;
            }
        }

        return 0 ;
    }

    public  static void  Addspecific(String service,float percentage)
    {
        discounts.put(service, percentage) ;
    }
    public  static void AddOverall(int transaction ,float percentage)
    {
        disoverall.put(transaction, percentage) ;
    }
    public static HashMap<String, Float> getDiscounts()
    {
        return discounts;
    }


}
