package constructorinjava;

public class A {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A s1=new A();
		System.out.println("s1 object");
		s1.show();
		s1.a=90;
		A s2 =new A();
		System.out.println("s1 object");
		s1.show();
		System.out.println("s2 object");
		s2.show();
		

	}
	public A() {
		a=54;
		
	}
	public void show() {
		System.out.println(a);
	}

}
