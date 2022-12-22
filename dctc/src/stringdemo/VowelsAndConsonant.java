package stringdemo;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcedDoEZQW 7865@#$ BQWEpo";
		String str1=str.toLowerCase();
		int v=0,c=0,d=0,s=0,g=0;
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else if(ch>='a'&&ch<='z')
			{
				c++;
			}
			else if(ch==' ')
			
			{
				g++;
			}
			else if(ch>='0'&&ch<='9')
			{
				d++;
			}
			else
			{
				s++;
			}
		}
			
		System.out.println("vowels:"+v);
		System.out.println("consonant:"+c);
		System.out.println("spase:"+g);
		System.out.println("digit:"+d);
		System.out.println("specialsymbol:"+s);

	}
	

}
