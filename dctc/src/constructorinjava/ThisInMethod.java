package constructorinjava;

public class ThisInMethod {
	int empid;
	String empcity;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ThisInMethod t = new ThisInMethod();
			t.get();
			System.out.println("employee city: "+t.empcity);
			System.out.println("employee id: "+t.empid);
			

	}
	public ThisInMethod() {
		show(this);
	}
	public void get() {
		show(this);
	}
	public void show(ThisInMethod u) {
	u.empid=101;
	u.empcity="mumbai";
	}

}
