package polymorphism;

public class Parentclass {
	int a=11;


public void add()
{
a+=a;
System.out.println("value of a:"+a);
}
public void add(int p,int q)
{
int b=p+q;
System.out.println("value of b:"+b);
}
}