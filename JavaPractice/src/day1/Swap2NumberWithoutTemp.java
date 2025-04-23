package day1;

public class Swap2NumberWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		
		System.out.println("Before Swapping a= "+a+" & b= "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping a= "+a+" & b= "+b);
		
		//float c=a%2;

	}

}
