package operterinjava;

public class OperterInJava {
	int a,b,c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OperterInJava s=new  OperterInJava();
		 s.add();
		 s.sub();
		 s.mul();
		 s.div();
		 s.mod();
	}
public void add() {
a=75;
b=25;
c=a+b;
System.out.println("addition: "+c);
}
public void sub() {
	c=a-b;
	System.out.println("substraction: "+c);
	
}
public void mul() {
	c=a*b;
	System.out.println("multiplication: "+c);
}
public void div() {
	c=a/b;
	System.out.println("division: "+c);
}
public void mod() {
	c=a%b;
	System.out.println("modulus: "+c);
}

}
