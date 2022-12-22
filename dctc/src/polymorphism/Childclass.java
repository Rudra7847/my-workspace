package polymorphism;

public class Childclass extends Parentclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass t=new Childclass();
		t.add();
		t.add(5.5, 5.5);
		t.add(90, 100);
		Parentclass s=new Parentclass();
		s.add();
		Parentclass s2=new Childclass();
		s2.add();

	}
	public void add()
	{
		int x=50,y=50;
		int c=x+y;
		System.out.println("value of c:"+c);
		
	}
	public void add(double m,double n)
	{
		double d=m+n;
		System.out.println("value of d:"+d);
	}

}
