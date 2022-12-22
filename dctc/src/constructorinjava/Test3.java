package constructorinjava;

public class Test3 {
	int empid;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 s=new Test3(10002);

	}
	public Test3() {
		empid=10001;
		System.out.println("in default constructor");
		System.out.println("employee id is:"+empid);
		
		
	}
	public Test3(int a) {
		this();
		
		System.out.println("in parameterised constructor");
		System.out.println("employee id is:"+a);
		
		
	}

}
