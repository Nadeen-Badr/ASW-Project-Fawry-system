package com.example.demo.Discount;

import java.util.HashMap;

public class Specific extends DiscountDecorator
{
	public static HashMap<String, Float> discounts = new HashMap<String,Float>(){{put("Mobile",(float) 20);put("Internet",(float) 20);}} ;
	
    Float percentage ;
	String ServicesName;
	
	public Specific() {
	}
	
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	public String getServicesName() {
		return ServicesName;
	}
	public void setServicesName(String servicesName) {
		ServicesName = servicesName;
	}

	private DiscountBehaviour beverage;
	public Specific(DiscountBehaviour beverage ,String service) 
	{
		this.beverage = beverage;
	   
		   percentage=discounts.get(service)/100;	
		   //System.out.println( " Mobile Servecies= " + dicount_behaviour.cost());
		   
	}
	public float cost() 
	{
		
		return (float) (beverage.cost()-(percentage*beverage.cost()));
	}
	
	@Override
	public String getDescription() 
	{
		// TODO Auto-generated method stub
		return beverage.getDescription()+"Special Discount";
	}
	public  static void Addspecific(String service,float percentage)
	{
		discounts.put(service, percentage) ;
	}
}