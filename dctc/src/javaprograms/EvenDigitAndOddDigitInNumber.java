package javaprograms;

import java.util.Scanner;

public class EvenDigitAndOddDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evencount ++;
			}
			else
			{
				oddcount ++;
			}
			num=num/10;
		}
		System.out.println("Totl Even Digits are: "+evencount);
		System.out.println("Totl Odd Digits are: "+oddcount);

	}

}
