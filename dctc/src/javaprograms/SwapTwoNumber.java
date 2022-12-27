package javaprograms;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a=sc.nextInt();
		System.out.println("Enter second Number: ");
		int b=sc.nextInt();
		System.out.println("Before Swapping Numbers are:"+a +" " +b);
		//logic 1
		/*int t=a;
		a=b;
		b=t;*/
		
		//logic 2
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		
		//logic3
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		//logic4
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping Numbers are:"+a +" " +b);

	}

}
