package exeptioninjava;

public class exceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=56,b=0,x=0;
		x=a*b;
		System.out.println("multiplication of a and b:"+x);
		try
		{
		x=a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("division of a and b:"+x);
		x=a+b;
		System.out.println("addition of a and b:"+x);
		x=a-b;
		System.out.println("substraction of a and b:"+x);

	}

}
