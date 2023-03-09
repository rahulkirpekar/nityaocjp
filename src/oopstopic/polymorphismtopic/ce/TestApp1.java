package oopstopic.polymorphismtopic.ce;
import java.util.Scanner;
public class TestApp1 
{
	// ZERO argument
	public void addFun() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = no1+no2;
		System.out.println("ZERO---Addition : " + ans);
	}
	// int--TWO Argument
	public void addFun(int no1,int no2) 
	{
		int ans = no1+no2;
		System.out.println("Two(int)---Addition : " + ans);
	}
	// float Two Argument
	public void addFun(float no1,float no2) 
	{
		float ans = no1+no2;
		System.out.println("Two(float)---Addition : " + ans);
	}
	// Three Argument
	public void addFun(int no1,int no2,int no3) 
	{
		int ans = no1+no2+no3;
		System.out.println("Three--Addition : " + ans);
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		obj.addFun();
		obj.addFun(10,20);
		obj.addFun(10.234f,20.2345f);
		obj.addFun(10,20,30);
	}
}
