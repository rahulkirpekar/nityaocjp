package collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new  TreeMap<Integer, String>();
		
		map.put(3, "ankur");
		map.put(1, "rahul");// entry--->[K,V]
		map.put(2, "brijesh");
		map.put(5, "rakesh");
		map.put(4, "sagar");

		
		for( Map.Entry<Integer, String> e	: map.entrySet()) 
		{
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}
}
