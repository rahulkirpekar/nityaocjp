package oopstopic.polymorphismtopic.rp;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your vechile Choice : ");
		System.out.println("1) For Two Wheelar");
		System.out.println("2) For Lmv Wheelar");
		System.out.println("3) For HMV Wheelar");
		
		Vehicle vehicle = null;
		int choice = sc.nextInt();
		switch(choice) 
		{
			case 1: vehicle = new TwUser();
					if (vehicle instanceof TwUser) 
					{
						// DownCasting
						TwUser twUser = (TwUser)vehicle;
						twUser.getTwParts();
						twUser.getSpec();	
					}
					break;
			case 2: vehicle = new LmvUser();
					if (vehicle instanceof LmvUser) 
					{
						// DownCasting
						LmvUser lmvUser = (LmvUser)vehicle;
						lmvUser.getLmvParts();
						lmvUser.getSpec();	
					}
					break;

			case 3: vehicle = new HmvUser();
					if (vehicle instanceof HmvUser) 
					{
						// DownCasting
						HmvUser hmvUser = (HmvUser)vehicle;
						hmvUser.getHmvParts();
						hmvUser.getSpec();	
					}
					break;
		}
//		Vehicle vehicle = new TwUser();
//		vehicle.getSpec();
//		
//		vehicle = new LmvUser();
//		vehicle.getSpec();
//		
//		vehicle = new HmvUser();
//		vehicle.getSpec();
//		
//		vehicle = new Vehicle();
//		vehicle.getSpec();
	}
}