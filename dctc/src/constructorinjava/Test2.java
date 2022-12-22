package constructorinjava;

public class Test2 {
	int n;
	boolean m;
	public static void main(String[] args) {
		Test2 t1=new Test2();
	}
	public Test2(){
		
    n=50;
	this.show();
	this.get();
	}
	public Test2(int a) {
		
		n=a;
	}
	public void show() {
		System.out.println("value of n: "+n);
	}
	public Test2(boolean x) {
		m=x;
	}
	public void get() {
		System.out.println("value of m: "+m);
	}

}
