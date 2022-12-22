package polymorphism;

public class Compiletimepolymorphism {
	int a=111;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiletimepolymorphism t=new Compiletimepolymorphism();
		t.get();
		t.get(55);
		t.get(1.1,2.2);
		float q= t.get(89f);
		System.out.println("value of q:"+q);

	}
	public void get()
	{
		System.out.println("value of a:"+a);
	}
	public void get(int x)
	{
		System.out.println("value of x:"+x);
	}
	public void get(double y,double z)
	{
		double p=y+z;
		System.out.println("value of p:"+p);
	}
	public float get(float m)
	{
		return m*m;
		
	}

}
