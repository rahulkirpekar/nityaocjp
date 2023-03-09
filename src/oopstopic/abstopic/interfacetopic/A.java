package oopstopic.abstopic.interfacetopic;

public interface A 
{
	// 1) Data Members---public static final
	// static final --- Constant variable -- Capital variable Name 
	public static final int NO1 = 10;
	int NO2 = 10;// public static final 
	public int NO3 = 10;// static final
	static int NO4 = 10;// public final
	final int NO5 = 10;// public static
	int NO6 = 10;// public static final 
	
	// 2) abstract methods---public abstract
	public abstract void test1();// public abstract 
	abstract void test2();// JVM--->public 
	public void test3();// JVM---abstract
	void test4();// JVM---public abstract
	
	
	// Non Abstract:-
	// java--8th version---[default,static]
	public default void test5() 
	{
		System.out.println("test5---Default method");
		test7();
	}
	public static void test6() 
	{
		System.out.println("test5---static method");
	}
	// java --9th version--[private]
	private void test7() 
	{
		System.out.println("test5---private method");
	}
}
