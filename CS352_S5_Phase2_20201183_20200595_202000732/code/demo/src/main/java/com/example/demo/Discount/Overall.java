package com.example.demo.Discount;

import java.util.HashMap;

import com.example.demo.User.UserControl;

public class Overall extends DiscountDecorator
{
	private DiscountBehaviour service;
	private DiscountRipo ripo=new DiscountRipo() ;
	public Overall() {
	}
	public Overall(DiscountRipo ripo)
	{
		this.ripo = ripo;
	}

	public Overall(DiscountBehaviour service)
	{
		this.service=service ;
	}
	public float getcost()
	{
		float precentage=ripo.ReturnOverallDiscounts(UserControl.currentu.getNumoftransaction());
		   return (float) (service.getcost()-(precentage* service.getcost()));

	}
	@Override
	public String getSname() {
		return null;
	}

	public void AddOverall(int transaction ,float percentage)
	{
		DiscountRipo. AddOverall(transaction,percentage) ;
	}
  public  HashMap<Integer, Float> ReturnDisoverall()
  {
	  return DiscountRipo. getDisoverall() ;
  }

}




