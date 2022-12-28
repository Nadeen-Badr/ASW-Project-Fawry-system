package com.example.demo.Discount;


public  abstract class DiscountDecorator implements DiscountBehaviour
{
	DiscountBehaviour obj;
	public abstract String getDescription();
	

}
