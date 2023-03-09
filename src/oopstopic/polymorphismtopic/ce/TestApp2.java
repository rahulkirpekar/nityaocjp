package oopstopic.polymorphismtopic.ce;

public class TestApp2 
{
	public static void addFun(short no1,short no2) 
	{
		System.out.println("int --- " + (no1 + no2));
	}
	public static void addFun(double no1,double no2) 
	{
		System.out.println("double --- " + (no1 + no2));
	}	
	public static void main(String[] args) 
	{
		addFun('A', 'F');
		
		
	}
}
