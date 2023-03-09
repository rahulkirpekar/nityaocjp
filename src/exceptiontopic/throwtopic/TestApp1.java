package exceptiontopic.throwtopic;

import java.util.Scanner;
public class TestApp1 
{
	public static void isValidAgeForVote(int age) throws InvalidAgeException 
	{
		if (age < 18) 
		{
			// Invalid Scenario---raise exception[checked / Unchecked]
			throw new InvalidAgeException("Invalid Age,\n\tPlease enter valid Age");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Vali Age : " );
		int age = sc.nextInt();
		
		try {
			isValidAgeForVote(age);// ---exception---JVM----crashed
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		System.out.println("After trycatch--main method");
	}
}
