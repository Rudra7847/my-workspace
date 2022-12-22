package constructorinjava;

public class B {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B(12);
		System.out.println("b1 object");
		b1.show();
		System.out.println("b2 object");
		B b2 =new B(12.12);
	
		System.out.println("b3 object");
		B b3=new B(12,12);
		
	

	}
	public B(int a) {
		n=a;
		
	}
	public B(double x) {
		System.out.println("inside double constructor: "+x);
	}
	public B(int p,int q) {
		System.out.println("p= "+p+"q: "+q);
	}
	public void show() {
		System.out.println("value of n: "+n);
	}


}
