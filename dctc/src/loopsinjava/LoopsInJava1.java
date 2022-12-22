package loopsinjava;
import java.util.Scanner;

import methodwithparameter.MethodWithParameter;

public class LoopsInJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int z=0;
		  do
		  {
			  System.out.println("hello");
			  z++;
		  }while(z>5);
		  Scanner n=new Scanner(System.in);
		  MethodWithParameter x=new MethodWithParameter();
		  int ch;
		
		  
		  do {
			  System.out.println("case 1 for addition,case 2 for avg,case 3 for substraction");
			  System.out.println("enter your choice");
			   ch=n.nextInt();
		  
		  switch(ch) {
		  case 1:
			  System.out.println("in case no 1:");
		  x.add_one_parameter(5);
		  break;
		  case 2:
			  System.out.println("in case no 2:");
			  x.avg_three_parameter(1.2f,2.1f ,3.1f);
			  break;
		  case 3:
			  System.out.println("in case no 3:");
			  x.sub_two_parameter(9,5);
			  break;
			  default:
				  
				  System.out.println("no case matched");
		  }
		  }while(ch!=4);

	}

}
