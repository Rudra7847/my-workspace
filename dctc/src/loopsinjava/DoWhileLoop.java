package loopsinjava;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER FIRST NUMBER: ");
		Scanner p=new Scanner(System.in);
	
		double n=p.nextDouble();
		int i=1;
		do{
		
			System.out.println(n*i);
			i++;
		
	}while(i<5);
		System.out.println("ENTER SECOND NUMBER: ");
		float a=p.nextFloat();
		for(i=0;i<11;i++) {
			System.out.println(a*i);
		}
		System.out.println("ENTER THIRD NUMBER:");
		  int ch=p.nextInt();
		 
		  do {
	        switch(ch) {
	        case 1:
	        	System.out.println("i like java");
	        	break;
	        case 2:
	        	System.out.println("i like c");
	        	break;
	        case 3:
	        	System.out.println("i like cpp");
	        	break;
	        case 4:
	        	System.out.println("i like python");
	        	break;
	        default:
	        	System.out.println("i dont like language");
	        	i++;
	        }
	        }while(i<10);
		  int z=0;
		  do
		  {
			  System.out.println("hello");
			  z++;
		  }while(z>5);
	        

	}

}
