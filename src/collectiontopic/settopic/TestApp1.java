package collectiontopic.settopic;

import java.util.TreeSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> nameList = new TreeSet<String>();
		
		nameList.add("rahul");
		nameList.add("ankur");
		nameList.add("rakesh");
		nameList.add("brijesh");
		nameList.add("ankur");
		nameList.add("rakesh");
		
		
		Iterator<String> itr =	nameList.iterator();
		
		while(itr.hasNext()) 
		{
			String value = itr.next();
			System.out.println(value);
		}
	}

}
