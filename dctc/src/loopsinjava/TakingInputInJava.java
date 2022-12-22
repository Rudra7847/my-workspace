package loopsinjava;
import java.util.Scanner;

public class TakingInputInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER NUMBER : ");
		int n=s.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(n*i);
		}
		System.out.println("ENTER STRING : ");
		String str=s.next();
		System.out.println(str);
		System.out.println("ENTER float : ");
		float x=s.nextFloat();
		System.out.println(x);
		System.out.println("ENTER 5 VALUES IN ARRAY: ");
		int y[]=new int[5];
		for (int i=0;i<y.length;i++)
		{
			y[i]=s.nextInt();
		}
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
		}

		}
		
		
		

	}


