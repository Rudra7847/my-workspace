package usethiskeyword;

public class B {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B t=new B(300);
		t.show();

	}
	B(int a)
	{
		this.a=a;
		
	}
	public void show()
	{
		System.out.println("value of a:"+a);
	}

}
