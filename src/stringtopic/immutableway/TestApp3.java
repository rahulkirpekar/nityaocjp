package stringtopic.immutableway;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String names[] = {"rahul","kunal","ankur","rakesh"};
					//	    0	     1	     2	      3		

		System.out.println("Names Lenght : " + names.length);// 5
	
		for (int i = 0; i < names.length; i++) 
		{
			int length = names[i].length();
			
			System.out.println(names[i] + " - " + length);
		}
	}
}
