package exeptioninjava;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checked exception--we are aware at compile time
		//unchecked exception--we are not aware
		int a=56,b=0,x=0;
		x=a*b;
		System.out.println("multiplication of a and b:"+x);
		x=a/b;
		System.out.println("division of a and b:"+x);
		x=a+b;
		System.out.println("addition of a and b:"+x);
		x=a-b;
		System.out.println("substraction of a and b:"+x);
		

	}

}
