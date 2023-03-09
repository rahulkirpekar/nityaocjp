package exceptiontopic.finallytopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		TestApp2 app = new TestApp2();
		
		app = null; // GC aap obejct ---> release()
		
		System.gc();
		
	}
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("HI I am Finalise Method");
	}
}
