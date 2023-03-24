package collectiontopic.listtopic;
import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listObj = new ArrayList();
		
		listObj.add("rahul");//0<==itr
		listObj.add(true);//1
		listObj.add(12);//2
		listObj.add(12.1234f);//3
		listObj.add(12.453);//4
		listObj.add('R');//5
		listObj.add(23L);//6 total - 7

		Student s = new Student(1, "rahul", 12);
		
		listObj.add(s);
		
		System.out.println(listObj.size());
		
//		for(int i=0;i<listObj.size();i++) 
//		{
//			Object obj = listObj.get(i);
//			if (obj instanceof Student) 
//			{
//				s = (Student) obj;
//				s.disp();
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		
//		for(Object obj : listObj) 
//		{
//			if (obj instanceof Student) 
//			{
//				s = (Student) obj;
//				s.disp();
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		Iterator itr =	listObj.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
