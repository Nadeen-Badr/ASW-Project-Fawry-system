package com.example.demo.Discount;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
@Component
public class Specific extends DiscountDecorator
{
	private DiscountRipo ripo=new DiscountRipo() ;
	private DiscountBehaviour service;

	public Specific() {
	}

	public Specific(DiscountRipo ripo )

	{
		this.ripo =ripo ;
	}
	public Specific(DiscountBehaviour service)
	{

		this.service=service ;
	}
	public float getcost()
	{
		float precentage=ripo.ReturnSpeceficDiscounts(service.getSname()) ;
		return (float) (service.getcost() - (precentage * service.getcost()));
	}

	@Override
	public String getSname() {
		return null;
	}



	public void Addspecific(String name ,float precentage)
	{
		ripo.Addspecific(name ,precentage) ;
	}
	public HashMap<String, Float> ReturnDisSpecefic()
	{
		return ripo.getDiscounts() ;
	}

}