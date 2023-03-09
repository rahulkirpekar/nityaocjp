package oopstopic.encapsulationstopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setRno(1);
		s.setName("Rahul");
		s.setStd(12);

		System.out.println(s.getRno() +  " " + s.getName() + " " +s.getStd());
	}
}
