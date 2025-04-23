package day1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter numer for Reverse: ");
		
		int number=scan.nextInt();
		int revNum=0;
		
		while(number!=0)
		{
			int digit=number%10; // Find Last digit
			
			revNum=revNum*10+digit; //Add Last number at first place
			
			number /=10; //Remove last digit
		}
		
		System.out.println("Reversed Number: "+revNum);
		
	}


}
