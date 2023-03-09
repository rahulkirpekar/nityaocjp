package exceptiontopic.finallytopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		int no1,no2,ans=0;
		
		no1=10;
		no2=0;
		try 
		{
			ans = no1/no2;
		}
		finally 
		{
			System.out.println("I am Finally Block");
		}
		System.out.println("Addition : " + ans);
	}
}
