package method;

public class MethodWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithReturnType s=new 	MethodWithReturnType();
		int c=s.add(10,20);
		
		System.out.println(c);
		boolean z=s.compare(2.2,2.3);
		System.out.println("result is: "+z);
		char w=(char)s.test_square(5);
		System.out.println(w);
		int b=s.test_square(5);
		System.out.println(b);

	}
	public int add(int a,int b) {
		int result=a+b;
		return result;
	}
	public boolean compare(double p,double q) {
		boolean x;
		if(p==q) {
			x=true;
		}
		else {
			x=false;
		}
		return x;
	}
	public int test_square(int m) {
		return m*m;
	}

}
