package oopstopic.polymorphismtopic.rp;

public class HmvUser extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("Hmv--getSpec()");
	}
	public void getHmvParts() 
	{
		System.out.println("HmvUser---getHmvParts()");
	}
}
