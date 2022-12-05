package software;

import java.util.HashMap;

public class Overall extends DiscountDecorator
{
	private DiscountBehaviour beverage;
	int num_transaction ;
	float percentage;
	static HashMap<Integer, Float> disoverall = new HashMap<Integer,Float>(){{put(0,(float) 20);}} ;
	public Overall(DiscountBehaviour beverage ,int transaction) 
	{
		this.beverage = beverage;
		percentage= (disoverall.get(transaction))/100;
		
	}
	public float cost() 
	{
	
		return (float) (beverage.cost()-( percentage*beverage.cost()));
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"Overall Discount";
	}
	public  static void AddOverall(int transaction ,float percentage)
	{
		disoverall.put(transaction, percentage) ;
	}
}




