package javaprograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		/*String rev_str="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev_str=rev_str+str.charAt(i);
		}
		System.out.println("Reverse String is:"+rev_str);*/
		
		StringBuffer sb=new StringBuffer(str);
		StringBuffer rev_str = sb.reverse();
		System.out.println("Reverse String is:"+rev_str);

	}

}
