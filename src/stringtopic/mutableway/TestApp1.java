package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// StringBuilder Vs StringBuffer
		
//		StringBuilder sb = new StringBuilder("rahul");
//		synchronized - MultiTgreaddding Implement Application--->'Threadsafe behavior'
		StringBuffer sb = new StringBuffer("rahul");

		System.out.println(sb + " " +sb.hashCode());
		sb.append(" Kirpekar");
		System.out.println(sb + " " +sb.hashCode());

//		String name1 = "rahul";
//		String name2 = " kirpekar";
//		String name3 = name1.concat(name2);
//		System.out.println(name1 + " " +name1.hashCode());
//		System.out.println(name2 + " " +name2.hashCode());
//		System.out.println(name3 + " " +name3.hashCode());
	}
}
