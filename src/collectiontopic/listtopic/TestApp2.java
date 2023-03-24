package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "rakesh", 12);
		Student s3 = new Student(3, "ankur", 12);
		Student s4 = new Student(4, "sagar", 12);
		
		ArrayList<Student>list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		Iterator<Student>itr = list.iterator();

		while (itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
	}
}
