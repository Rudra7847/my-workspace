package superkey;

public class D extends C {
	int w;
	D()
	{
		w=10;
	}
	D(int a)
	{
		super(400);
		w=a;
	}
	public void get()
	{
		super.add();
			System.out.println("value of w:"+w);
			System.out.println("value of y:"+y);
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1=new D();
		d1.get();
		D d2=new D(200);
		d2.get();
		

	}

}
