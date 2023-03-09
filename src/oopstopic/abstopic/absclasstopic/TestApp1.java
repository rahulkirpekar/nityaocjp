package oopstopic.abstopic.absclasstopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Polymorphic Object
		Vehicle vehicle = new TwUser();
		vehicle = new TwUser();
		vehicle.getSpec();
		vehicle = new LmvUser();
		vehicle.getSpec();
		vehicle = new HmvUser();
		vehicle.getSpec();
				
//		vehicle = new Vehicle();
	}
}
