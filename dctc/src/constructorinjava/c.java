package constructorinjava;

public class c {
	static int m;
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c c1=new c(10);
		c1.show();
		c c2=new c(50,60);
		c2.show();
		c c3=new c(15.15);
		c3.show();

	}
	public c(int x) {
		m=x;
		n=1;
	}
	public c(int a,int b) {
		m=25;
		n=35;
		System.out.println("a:"+a+" b"+b);
	}
	public c(double s) {
		m=101;
		n=102;
		System.out.println("inside double :"+s);
	}
	public void show() {
		System.out.println("value of m:"+m);
		System.out.println("value of n:"+n);
	}

}
