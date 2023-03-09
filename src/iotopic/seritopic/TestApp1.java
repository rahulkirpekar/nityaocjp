package iotopic.seritopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1, "nitya", 12);
		
		try 
		{
			FileOutputStream fout = new  FileOutputStream("studentlist.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
		
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
