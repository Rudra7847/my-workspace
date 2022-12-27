package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		//logic1-using algorithm
		int rev_num=0;
		/*while(num!=0)
		{
			rev_num=rev_num*10+num%10;
			num=num/10;
		}*/
		
		//logic2-using StringBuffer
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse Number is:"+rev);*/
		//System.out.println("Reverse Number is:"+rev_num);
		
		//logic3-using StringBuilder
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
				
		System.out.println("Reverse Number is:"+rev);

	}

}
