package oopstopic.abstopic.interfacetopic.ex1;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		System.out.println("1) For TwUser");
		System.out.println("2) For LmvUser");
		System.out.println("3) For HmvUser");
		int choice=sc.nextInt();
		Vehicle v = null;
		switch (choice) 
		{
				case 1: v = new TwUser();
						v.getSpec();
						break;
						
				case 2: v = new LmvUser();
						v.getSpec();
						break;
				
				case 3: v = new HmvUser();
						v.getSpec();
						break;
		}
	}
}
