package oopstopic.polymorphismtopic.rp;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Vehicle vehicle = new TwUser();
		
		if (vehicle instanceof LmvUser) 
		{
			LmvUser lmvUser = (LmvUser)vehicle;
			lmvUser.getLmvParts();
		} else if(vehicle instanceof HmvUser)
		{
			HmvUser hmvUser = (HmvUser)vehicle;
			hmvUser.getHmvParts();
		} else if(vehicle instanceof TwUser)
		{
			TwUser twUser = (TwUser)vehicle;
			twUser.getTwParts();
		}
		
	}
}
