package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		String name = null;
								//  java.lang.NullPointerException
//		System.out.println("Name Length : " + name.length());
		
//		int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]
		// ArrayIndexOutofboundException
//		a[5] = 100;
//		System.out.println("A[5] : " + a[5]);

		
//		String name = "royal techno";// 12
				//     012345678901
		
//		System.out.println("Name Length : " + name.length());
		
//		java.lang.StringIndexOutOfBoundsException:
//		System.out.println(name.charAt(12));
		

//		String value = "abcd";
		
		// NumberFormateException
//		int no = Integer.parseInt(value);
////		System.out.println(no);

		
//		A objA = new A();
//		B objB = new B();

		// Polymorphic Object
		A objA = new B();

		// java.lang.ClassCastException
		C objC = (C)objA;		
		
		
		System.out.println(objC);
		
		
		
	}
}
