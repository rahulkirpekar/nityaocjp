package innertopic.ai;

public class TestApp 
{
	public static void main(String[] args) 
	{
		// Anonymous InnerClass
		A obj = new A() 
		{
			@Override
			public void test1() 
			{
				System.out.println("A---Test1()---"+this);
			}
		};
		
		obj.test1();
		
	}
}
