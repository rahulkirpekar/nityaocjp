package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		TreeSet<String>list = new TreeSet<String>();
		list.add("rahul");
		list.add("rakesh");
		list.add("ankur");
		list.add("ramesh");
		list.add("brijesh");
		list.add("rahul");
		list.add("rakesh");
		list.add("ankur");
		
		Iterator<String> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			String value=  itr.next();
			System.out.println(value);
		}
	}
}
