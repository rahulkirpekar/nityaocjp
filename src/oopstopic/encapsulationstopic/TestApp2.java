package oopstopic.encapsulationstopic;
import java.util.Scanner;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			// local variable
			System.out.println("Enter Rno : ");
			int rno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name : ");
			String name = sc.nextLine();
			System.out.println("Enter std : ");
			int std = sc.nextInt();
			
			s[i].setRno(rno);
			s[i].setName(name);
			s[i].setStd(std);
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].getRno() + " " + s[i].getName() + " "+ s[i].getStd());
		}
	}
}


