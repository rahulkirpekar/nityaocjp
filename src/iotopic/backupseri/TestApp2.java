package iotopic.backupseri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\nityaocjp\\jainish.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
		
			Student s[] =(Student[])oin.readObject();
			for (int i = 0; i < s.length; i++) 
			{
				s[i].disp();
			}
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
