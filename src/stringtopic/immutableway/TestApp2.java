package stringtopic.immutableway;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "technosoft";
//		String name4 = name1.concat(name3);// "royaltechnosoft";	

		System.out.println(name1.hashCode());//435
		System.out.println(name2.hashCode());//435
		System.out.println(name1==name2);// true
		System.out.println(name1==name2);// true
		
		System.out.println(name1.equals(name2));// true
		System.out.println(name1.equals(name3));// false
		// string value---equals method
		// reference - [==]
	}
}
