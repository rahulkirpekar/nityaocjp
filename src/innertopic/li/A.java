package innertopic.li;

public class A 
{
	private int data = 200;
	void disp() 
	{
		// Local Innerclass
		class B
		{
			void show() 
			{
				System.out.println("Data - "+data);
			}	
		}
		B obj = new B();
		obj.show();
	}
	public static void main(String[] args) 
	{
		A objA = new A();
		
		objA.disp();
	}
}





