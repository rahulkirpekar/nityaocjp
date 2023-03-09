package oopstopic.polymorphismtopic.rp;

public class TwUser extends Vehicle
{
	public void getSpec() 
	{
		// child specific
		System.out.println("TwUser - getSpec()");
	} 
	public void getTwParts() 
	{
		System.out.println("TwUser---getTwParts()");
	}
}
