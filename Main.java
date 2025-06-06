package matkonet2Exercise;
import java.util.*;

public class matkonet2 {
	static Scanner input = new Scanner(System.in);

	
	
	public static boolean check(int amount)
	{
		int sum=0;
		for( int i=0; i<amount;i++)
		{
			System.out.println("Enter price");
			sum+=input.nextInt();
		}
		return sum > 150;
	}
	
	public static void checkAll()
	{
		int amount=0;
		int people=0;
		
		for( int i=0; i<850; i++)
		{
			System.out.println("Enter amount of items");
			amount= input.nextInt();
			if(check(amount))
			{
				people++;	
			}
		}
		System.out.print("Amount of people that need to pay delivery fee: "+people);
	}
	
	public static int[] checkAge(int age)
	{
		int[] arr= new int[3];
		if(age > 11)
		{
			arr[0] = 1;
			if(age > 15)
			{
				arr[1] = 1;
				if(age > 17)
				{
					arr[2] = 1;
				}
				else
				{
					arr[2] = 0;
				}
			}
			else
			{
				arr[1] = 0;
			}
		}
		return arr;
	}
	
	public static int count()
	{
		int[] counters = new int[3];    // define 3 counters starting at {0,0,0}
		System.out.println("Insert your age: ");
		int age = input.nextInt();
		int[] visitor = checkAge(age);
		while (counters[0] == 1)
		{
			for(int i = 0; i < 3; i++)
			{
				counters[i] += visitor[i];
			}
			System.out.println("Insert your age: ");
			age = input.nextInt();
			visitor = checkAge(age);
		}
		System.out.println(counters[0] + ", " + counters[1] + ", " + counters[2]);
	}
	
	
	
	public static void printExcellent(ReportCard[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].isExcellent())
			{
				System.out.println(arr[i].getStuName());
			}
		}
	}
	
	
	
	public static void main(String[] args) {
	
		
		
	}

}
