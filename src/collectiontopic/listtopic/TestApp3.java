package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mainList  = new ArrayList<String>();

		mainList.add("rahul");//0
		mainList.add("ankur"); //1
		mainList.add("rakesh");//2
		mainList.add("sagar"); //3
		mainList.add("kunal"); //4

		
		ListIterator<String> itr =	mainList.listIterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("--------------------");
		while(itr.hasPrevious()) 
		{
			String name = itr.previous();
			System.out.println(name);
		}
		
//		System.out.println("mainList.isEmpty() : " + mainList.isEmpty());
		
		
//		mainList.add(2, "Tejas");
		
//		for (int i = 0; i < mainList.size(); i++) 
//		{
//			String name = mainList.get(i);
//			System.out.println(name);
//		}
		
//		System.out.println(mainList.get(3));
		
		
//		ArrayList<String> subList  = new ArrayList<String>();
		
//		subList.add("Jainish");
//		subList.add("Nitya");
		
//		mainList.addAll(subList);
//		mainList.addAll(3, subList);
//		System.out.println("----------------------------");
//		for (int i = 0; i < mainList.size(); i++) 
//		{
//			String name = mainList.get(i);
//			System.out.println(name);
//		}
		
		
	}
}
