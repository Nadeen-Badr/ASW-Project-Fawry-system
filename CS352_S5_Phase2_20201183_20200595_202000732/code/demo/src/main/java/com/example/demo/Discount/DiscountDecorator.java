package com.example.demo.Discount;


public abstract  class DiscountDecorator implements DiscountBehaviour
{
	DiscountBehaviour discount;

	@Override
	public float getcost() {
		return 0;
	}



}
