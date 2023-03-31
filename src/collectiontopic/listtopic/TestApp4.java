package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
//		1) C - Create
//		2) R - Read
//		3) U - Update
//		4) D - Delete
		int choice = 0;
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new  Scanner(System.in);

		while(choice!=5) 
		{
			System.out.println("Enter below Choice : ");
			System.out.println("1) For Insert Record"); 
			System.out.println("2) For Update Record By Rno");
			System.out.println("3) For Delete by Rno");
			System.out.println("4) For Display Students records");
			System.out.println("5) For Exit");
			choice = sc.nextInt();
			
			switch(choice) 
			{
				case 1: Student s = new Student();
						s.scan();
						list.add(s);
						System.out.println("Student record successfully inserted.");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4: 
						for (int i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							s.disp();
						}
					break;
				default:
						System.out.println("Invalid Choice");
			}
		}	
	}
}
