package constructorinjava;

public class X {
	int n=123;
	public X() {
		System.out.println("Inside X Constructor:");
		Y p=new Y(this);
	}
	public void emp_details() {
		System.out.println("Inside employee details method");
	}

}
