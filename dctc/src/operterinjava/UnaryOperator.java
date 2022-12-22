package operterinjava;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=5;
        a++;
        System.out.println("value of a (increament): "+a);
        int b=5;
        b--;
        System.out.println("value of b (decriment): "+b);
        int x=~a;
        System.out.println("value of x (complement): "+x);
        boolean y=false;
        boolean z=!y;
        System.out.println("value of z (not operator): "+z);
        int m,n=10;
        m=n++;
        System.out.println("value of m : "+m);
        System.out.println("value of n : "+n);
        
        m=++n;
        System.out.println("value of m : "+m);
        System.out.println("value of n : "+n);
        m=n--;
        System.out.println("value of m : "+m);
        System.out.println("value of n : "+n);
        m=--n;
        System.out.println("value of m : "+m);
        System.out.println("value of n : "+n);
        
	}

}
