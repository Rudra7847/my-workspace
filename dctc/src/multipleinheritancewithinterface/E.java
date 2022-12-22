package multipleinheritancewithinterface;

public class E extends D  {
	
	public void show()
	{
		int p=50+x;
		System.out.println("value of p:"+p);
		int q=100+y;
		System.out.println("value of q:"+q);
		int r=200+z;
		System.out.println("value of r:"+r);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e1=new E();
		e1.add();
		e1.sub();
		e1.mul();
		e1.show();
	}

	

}
