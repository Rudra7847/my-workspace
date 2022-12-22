package multipleinheritancewithinterface;

public class D implements A,B,C{
	int x=600;
	int y=500;
	int z=800;
	
	

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int z=c*300;
		System.out.println("value of z:"+z);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int y=220-b;
		System.out.println("value of y:"+y);
		
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int x=a+100;
		System.out.println("value of x:"+x);
		
	}

}
