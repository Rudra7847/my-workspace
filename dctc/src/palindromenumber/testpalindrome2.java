package palindromenumber;

import java.util.Scanner;

public class testpalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		int len=str.length();
		String rev_str="";
		String org_str=str;
		for(int i=len-1;i>=0;i--)
		{
			rev_str=rev_str+str.charAt(i);
		}
		if(rev_str.equals(org_str))
		{
			System.out.println(org_str+" is palindrome");
		}
		else
		{
			System.out.println(org_str+" is not palindrome");
		}


	}

}
