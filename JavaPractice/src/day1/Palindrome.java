package day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter input string to check Palindrome or not");
		
		String input = scan.next();
		String rev = "";
		
		for (int i=input.length()-1; i>=0; i--)
		{
			rev +=input.charAt(i);
		}

		System.out.println(rev);
		
		if (input==rev)
		{
			System.out.println("Entered string is palindrome");
		}
		else
		{
			System.out.println("Entered string is not palindrome");
		}
	}

}
