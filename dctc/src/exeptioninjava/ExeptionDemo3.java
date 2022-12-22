package exeptioninjava;

public class ExeptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {10,0,20,30};
		int a=x[0]*x[1];
		System.out.println("multiplication:"+a);
		try
		{
		int b=x[4]/x[1];
		System.out.println("division:"+b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		int c=x[2]+x[3];
		System.out.println("addition:"+c);
		int d=x[3]-x[2];
		System.out.println("substraction:"+d);
		

	}

}
