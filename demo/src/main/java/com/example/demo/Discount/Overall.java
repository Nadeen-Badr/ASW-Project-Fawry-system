package com.example.demo.Discount;

import java.util.HashMap;

public class Overall extends DiscountDecorator
{
	private DiscountBehaviour beverage;
	int num_transaction ;
	int percentage;
	//public static HashMap<Integer, Float> disoverall = new HashMap<Integer,Float>(){{put(0,(float) 20);}} ;
	

	public Overall() {
	}
	
	public int getNum_transaction() {
		return num_transaction;
	}

	public void setNum_transaction(int num_transaction) {
		this.num_transaction = num_transaction;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	/*public Overall(DiscountBehaviour beverage ,int transaction) 
	{
		this.beverage = beverage;
		percentage= (disoverall.get(transaction))/100;
		
	}*/
	public float cost() 
	{
	
		return (float) (beverage.cost()-( percentage*beverage.cost()));
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"Overall Discount";
	}
	/*public  static void AddOverall(int transaction ,float percentage)
	{
		disoverall.put(transaction, percentage) ;
	}*/
}




