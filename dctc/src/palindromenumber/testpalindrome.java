package palindromenumber;

import java.util.Scanner;

public class testpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==org_num)
		{
			System.out.println(org_num+" is palindrome");
		}
		else
		{
			System.out.println(org_num+" is not palindrome");
		}

	}

}
