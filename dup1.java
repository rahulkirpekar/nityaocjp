package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// String Data ---ready
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// abcd
		
		byte b[] =  name.getBytes();// a-97,b-98,..
		
		FileOutputStream fout = null;
		try 
		{
			fout = new FileOutputStream("list.txt");
			
			fout.write(b);
			
			System.out.println("success");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
