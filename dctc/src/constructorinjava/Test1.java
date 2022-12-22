package constructorinjava;

public class Test1 {
	int a;
	boolean b;
	char c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		t1.show();
		Test1 t2=new Test1(70);
		t2.show();
		Test1 t3=new Test1(true);
		t3.show();
		

	}
	public Test1(){
		a=10;
		b=true;
		c='p';
	}
	public Test1(int a) {
		this.a=a;
	
	}
	public Test1(boolean b) {
		this.b=b;
	}
	public void show() {
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		System.out.println("value of c: "+c);
		
		
		
	}
	

}
