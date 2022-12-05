package software;

public  abstract class DiscountDecorator implements DiscountBehaviour
{
	DiscountBehaviour obj;
	public abstract String getDescription();
	

}
