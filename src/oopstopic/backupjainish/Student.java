package oopstopic.backupjainish;

public class Student 
{
	private int rno;
	private String name;
	private int std;

	// 1) Default Constructor
	public Student() 
	{
		System.out.println("START :: DEFAULT Constructor----"+this);
		rno=1;
		name="Jainish";
		std=8;
		System.out.println("EXIT :: DEFAULT Constructor");
	}
	// 1) Para Constructor
	public Student(int rno,String name,int std) 
	{
		System.out.println("START :: PARA Constructor----"+this);
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println("EXIT :: PARA Constructor");
	}
	public Student(Student s) 
	{
		System.out.println("START :: COPY Constructor----"+this);
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		System.out.println("EXIT :: COPY Constructor");
	}
	public void disp() 
	{
		System.out.println(rno + " "+ name + " " +std+"----"+this);
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: Main Method");
		// 1) Object Create---> 1) Memory Allocation--Dm's + // 2) Dm's Initialisation
		Student s1 = new Student();
		Student s2 = new Student(2,"Krunal",12);
		Student s3 = new Student(s2);
		
		// 3) object use
		s1.disp();
		s2.disp();
		s3.disp();

		System.out.println("EXIT :: Main Method");
	}
}
