package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Vector<String>vector = new Vector<String>();
		vector.add("rahul");
		vector.add("rakesh");
		vector.add("ankur");
		vector.add("ramesh");
		vector.add("brijesh");
		
		Iterator<String> itr =	vector.iterator();
		
		while(itr.hasNext()) 
		{
			String value=  itr.next();
			System.out.println(value);
		}
	}
}
