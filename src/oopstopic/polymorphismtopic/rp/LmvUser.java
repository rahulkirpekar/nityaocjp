package oopstopic.polymorphismtopic.rp;

public class LmvUser extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("LmvUser -- getSpec()");
	}
	public void getLmvParts() 
	{
		System.out.println("LmvUser---getLmvParts()");
	}
}
