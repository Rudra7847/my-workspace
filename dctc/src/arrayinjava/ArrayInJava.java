package arrayinjava;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println(a[3]);
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		double b[]= {10.10,20.20,30.30,40.40,50.50,60.60,70.70,80.80,90.90,100.100};
		System.out.println(b[3]);
		System.out.println("length of string: "+b.length);
		for(int k=0;k<b.length;k++)
		{
			System.out.println(b[k]);
		}
		char x[]= {'s','o','n','a','l','i','s','m','y','w','i','f','e'};
	
		System.out.println(x[7]);
		for(int j=0;j<x.length;j++)
		{
			System.out.println(x[j]);
		}
		System.out.println("length of array x: "+x.length);
		String s[]= {"i"," ","love"," ","my"," ","india"};
		for(int n=0;n<s.length;n++)
		{
			System.out.print(s[n]);
		}
		ArrayInJava a1=new ArrayInJava();
		a1.array_test(a);
		a1.array_test1(x);

	}
	public void array_test(int[]m)
	{
		System.out.println("Inside array test function");
		for(int x=0;x<m.length;x++)
		{
			System.out.println(m[x]);
		}
	}
	public void array_test1(char[]y) {
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]);
		}
	}

}
