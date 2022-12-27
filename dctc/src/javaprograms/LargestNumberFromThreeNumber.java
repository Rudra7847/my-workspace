package javaprograms;

import java.util.Scanner;

public class LargestNumberFromThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number:");
		int a=sc.nextInt();
		System.out.println("Enter a First Number:");
		int b=sc.nextInt();
		System.out.println("Enter a First Number:");
		int c=sc.nextInt();
		/*if(a>b&&a>c)
		{
			System.out.println("Greter Number is:"+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Greter Number is:"+b);
		}
		else
		{
			System.out.println("Greter Number is:"+c);
		}*/
		int gretest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Greter Number is:"+gretest);



	}

}
