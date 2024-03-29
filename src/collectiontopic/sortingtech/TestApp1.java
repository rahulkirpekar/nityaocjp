package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2,"Krunal",11);
		Student s3 = new Student(3,"rakesh",10);
		Student s4 = new Student(4,"Ankur",9);
		Student s5 = new Student(5,"Darshan",8);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr =	list.iterator();

		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		
		Collections.sort(list);
		
		System.out.println("After Sorting Data Stdwise : ");
		itr =	list.iterator();

		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		
	}
}
