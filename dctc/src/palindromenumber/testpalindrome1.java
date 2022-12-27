package palindromenumber;

public class testpalindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCBA";
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
