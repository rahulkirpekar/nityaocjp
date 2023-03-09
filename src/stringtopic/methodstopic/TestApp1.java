package stringtopic.methodstopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{

		String name1 = "royal";
		String name2 = "royal";
		String name3 = new String("royal").intern();


		System.out.println(name1==name2);//true
		System.out.println(name1==name3);//true
		
		
//		String str = new String("hello javatpoint how r u");  
//	    //                       012345678901234567890123
//		char[] ch = new char[10];// javatpoint  
//	    //                          0123456789
//	    str.getChars(6, 16, ch, 0);  
//	    System.out.println(ch);  
//		Scanner sc = new Scanner(System.in);
//		String name="abcde";  
		//           65 66 67 68 69
		
//		byte b[] = name.getBytes();// io
		
		
//		for (int i = 0; i < name.length(); i++) 
//		{
//			System.out.println(name.charAt(i) + " - "+ b[i] );
//		}
//		String sf1=String.format("name is %s",name);  
//		String sf2=String.format("value is %f",32.33434);  
//		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
		  
//		System.out.println(sf1);  
//		System.out.println(sf2);  
//		System.out.println(sf3);  
		
		
		
//		String name1="admin";  
//		String name2="ADMI";  
		
//		System.out.println("name1.equalsIgnoreCase(name2) - " + name1.equalsIgnoreCase(name2));// 
		
//		System.out.println(name.endsWith("me")); // true 
		
//		System.out.println(name.contains("about"));  // true
		
//		System.out.println(name.contains("hello")); // false  
		
		
		
//		System.out.println("Enter Name1 : ");
//		String name1 = sc.nextLine();// rahul
//		System.out.println("Enter Name2 : ");
//		String name2 = sc.nextLine();// kirpekar

//		String name3 = name1.concat(name2);// rahul kirpekar
		
//		System.out.println("Name3 : " + name3);
		
		
//		System.out.println("name1.equals(name2) - " + name1.equals(name2));
//		System.out.println("name1.compareTo(name2) - " + name1.compareTo(name2));
		
		// 1) equals values --- true/false
		// 2) compareTo(name1,name2)---same-->0 / not same ---positive/negative
	}
}
