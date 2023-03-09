package iotopic.characterorientedway;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// FileWriter -- writting 
public class TestApp1 
{
	public static void main(String[] args) 
	{
		// String Data ---ready
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// abcd
		FileWriter fw = null;
		try 
		{
			fw =  new FileWriter("test.txt");

			fw.write(name);
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fw.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
