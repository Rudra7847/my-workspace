package abstractdemo;

public abstract class Abc {
	int m;
	public abstract void show();
	public abstract void get();
	public void add()
	{
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println("addition of a and b:"+result);
	}
	Abc()
	{
		m=100;
	}
	public void get_input()
	{
		System.out.println("INSIDE GET INPUT METHOD");
	}

}
