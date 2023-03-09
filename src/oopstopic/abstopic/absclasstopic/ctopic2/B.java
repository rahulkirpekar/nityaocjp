package oopstopic.abstopic.absclasstopic.ctopic2;
public class B extends A
{
	@Override
	void test1() 
	{
		System.out.println("B --- test1()");
	}
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test1();
		obj.no1=10;
		obj.no2=20;
		System.out.println("No1 : " + obj.no1);
		System.out.println("No2 : " + obj.no2);
	}
}
