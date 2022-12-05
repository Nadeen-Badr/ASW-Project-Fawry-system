package software;

import java.util.ArrayList;
import java.util.List;

public class RefundList 
{
	
public static  List<Refund> list=new ArrayList<Refund>();
public static  void addrefund(Refund newrefund)
{
	list.add(newrefund) ;
}
}