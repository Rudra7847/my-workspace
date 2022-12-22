package constructorinjava;

public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X q=new X();

	}
	public Y(X r) {
		System.out.println("Inside Y constructor:"+r.n);
		r.emp_details();
	}

}
