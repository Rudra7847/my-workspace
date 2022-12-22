package superkey;

public class B extends A {
	
	int a;
	B()
	{
		super();
		a=100;
	}
	B(int x,int y)
	{
		super(70,80);
		a=x+y;
	}
	public void show()
	{
		
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B t1=new B();
		t1.show();
		B t2=new B(20,30);
		t2.show();

	}

}
