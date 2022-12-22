package usethiskeyword;

public class A {
	int a=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A t=new A();
		
		

	}
	A()
	{
		System.out.println("value of a:"+a);
		this.show();
	}
	public void show()
	{
		a+=a;
		System.out.println("value of a:"+a);
		
	}

}
