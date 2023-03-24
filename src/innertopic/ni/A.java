package innertopic.ni;

public class A 
{
	private static int data = 100;
	// Nested InnerClass
	static class B
	{
		void disp() 
		{
			System.out.println("Data - " + data);
		}
	}
	public static void main(String[] args) 
	{
		A.B objB = new A.B();
		
		objB.disp();
	}
}
