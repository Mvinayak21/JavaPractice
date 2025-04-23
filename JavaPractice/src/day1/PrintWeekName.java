package day1;

import java.util.Scanner;

public class PrintWeekName {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter input number between 1 to 7");
		int input= scan.nextInt();
		
		
		if(input==1)
		{
			
			System.out.println("Sunday");
		}
		else if (input==2)
		{
			System.out.println("Monnday");
		}
		else if (input==3)
		{
			System.out.println("Tuesday");
		}
		else if (input==4)
		{
			System.out.println("Wednesday");
		}
		else if (input==5)
		{
			System.out.println("Thursday");
		}
		else if (input==6)
		{
			System.out.println("Friday");
		}
		else if (input==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Please enter valid input number between 1 to 7");
		}
	}

}
