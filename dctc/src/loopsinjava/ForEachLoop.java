package loopsinjava;
import java.util.Scanner;
public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[]= {2.1,2.2,2.3,2.4,2.5};
		for(double r:x)
		{
			System.out.println(r);
		}
		String str[]= {"I","LOVE","MY","INDIA"};
		for(String p:str)
		{
			System.out.println(p);
		}
		Scanner a1=new Scanner(System.in);
		System.out.print("ENTER NUMBER: ");
		int n=a1.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(n*i);
		}
		System.out.println("ENTER STRING: ");
		String m=a1.next();
		System.out.println(m);
		System.out.println("enter number:");
		float f=a1.nextFloat();
		for(int i=1;i<11;i++) {
			System.out.println(f*f*f*i);
		}
		System.out.print("ENTER FIVE VALUES IN ARRAY: ");
		double w[]=new double [5];
		for(int i=0;i<w.length;i++) {
			w[i]=a1.nextDouble();
		}
		for(int i=0;i<w.length;i++){
			System.out.println(w[i]);
		}
		
		

	}

}
