package abstractdemo;

public class Xyz extends Abc {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz t1 =new Xyz();
		t1.show();
		t1.get();
		t1.get_input();
		t1.show_now();
		Abc t2=new Xyz();
		t2.add();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("INSIDE SHOW METHOD");
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("INSIDE GET METHOD");
		
	}
	Xyz()
	{
		n=200;
	}
	public void show_now()
	{
		System.out.println("value of m:"+m);
		System.out.println("value of n:"+n);
	}

}
