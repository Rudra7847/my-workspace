package javaprograms;

import java.util.Scanner;

public class NumberofDigitinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digit in Number is:"+count);

	}

}
