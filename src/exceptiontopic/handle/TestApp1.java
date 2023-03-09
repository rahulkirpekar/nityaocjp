package exceptiontopic.handle;

import java.util.Scanner;

public class TestApp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();

		// Handle---try..catch
		int ans = 0;
		try 
		{
			try 
			{
				// raise Exception
				ans = no1 / no2;// ArithmeticException---> 12 / 0
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		
			try {
				String name = "nitya";
				System.out.println("name.length() - " + name.length());

			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]
				a[5] = 10;// ArrayIndexoutofBoundException
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ans : " + ans);
	}
}
