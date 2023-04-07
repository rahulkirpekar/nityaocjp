package collectiontopic.sortingtech;

import java.util.Scanner;

public class Student implements Comparable<Student>
{
	private int rno;
	private String name;
	private int std;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void disp() 
	{
		System.out.println(rno + " "+name + " "+ std);
	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter std : ");
		std = sc.nextInt();
	}
	@Override
	public int compareTo(Student s2) 
	{
		if(std > s2.std) 
		{
			return 1;
		}else if(std < s2.std) 
		{
			return -1;			
		}else 
		{
			return 0;
		}
	}
}
