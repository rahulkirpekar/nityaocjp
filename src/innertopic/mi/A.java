package innertopic.mi;

public class A 
{
	private int no = 100;
	
	// 1) Member InnerClass
	class B
	{
		void msg() 
		{
			System.out.println("No : "+ no) ;
		}
	}
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objB = objA. new B(); 

		objB.msg();
	}
}
