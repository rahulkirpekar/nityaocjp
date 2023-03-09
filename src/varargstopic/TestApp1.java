package varargstopic;

public class TestApp1 
{
	// varargs--->Variable Arguments
	public void addFun(int...a) 
	{
		int ans =0;
		for(int i=0;i<a.length;i++) 
		{
			ans = ans+ a[i];
		}
		System.out.println("Addition : " + ans);
	}
	public static void main(String[] args) 
	{
		
		TestApp1 app = new  TestApp1();
		
		app.addFun(1,2,3,4,5,6,7,8,9,10);// 
	}
}
