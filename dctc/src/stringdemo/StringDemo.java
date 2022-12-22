package stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Vinayak");
		String s2=s1.toUpperCase();
		System.out.println("In upper case:"+s2);
		String s3=s2.toLowerCase();
		System.out.println("In upper case:"+s3);
		s3=s1+s2;
		System.out.println("concat:"+s3);
		System.out.println("concat:"+s3);
		System.out.println("lenght of string:"+s3.length());
		System.out.println("character at 2nd position:"+s3.charAt(1));
		char s[]=s3.toCharArray();
		for(char c:s)
		{
			System.out.println(c);
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("index of :"+s3.indexOf('n'));
		System.out.println("index of :"+s3.indexOf('a',1));
		System.out.println("contains:"+s3.contains("nayak"));
		System.out.println("start with:"+s3.startsWith("Vi"));
		System.out.println("ends with:"+s3.endsWith("ak"));
		String s4="   hii sona     ";
		System.out.println("without removing spase:"+s4);
		System.out.println("without removing spase:"+s4.trim());

	}

}
