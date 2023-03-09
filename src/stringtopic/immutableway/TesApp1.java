package stringtopic.immutableway;

import java.util.Scanner;

public class TesApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// single line--> Multiple words word

//		name = "royal"
//              01234		
//		System.out.println(name + "---" +name.hashCode());
//		name = "Jainish";
//		System.out.println(name + "---" +name.hashCode());

		System.out.println("name.length() - " + name.length());
		
		for(int i=0;i<name.length();i++) 
		{
			System.out.println("name.charAt("+i+") - " + name.charAt(i));
		}
		
	}
}
