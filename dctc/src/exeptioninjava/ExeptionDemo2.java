package exeptioninjava;

public class ExeptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {12,30,0,50};
		try
		{
		int a=x[4]*x[2];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		//System.out.println("multiplication :"+a);
		try
		{
		int b=x[0]/x[2];
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		//System.out.println(":"+b);
		int c=x[0]+x[1];
		System.out.println("addition :"+c);
		int d=x[1]-x[0];
		System.out.println("substraction:"+x);

	}

}
