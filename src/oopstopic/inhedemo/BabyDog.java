package oopstopic.inhedemo;

public class BabyDog extends Dog
{
	public void getBabyDogThings() 
	{
		System.out.println("BabyDog -- getBabyDogThings() ");
	}
	public static void main(String[] args) 
	{
		BabyDog babyDog = new BabyDog();//getAnimalDetails()  + getDogFood()
		
		babyDog.getAnimalDetails();
		babyDog.getDogFood();
		babyDog.getBabyDogThings();
	}
}
