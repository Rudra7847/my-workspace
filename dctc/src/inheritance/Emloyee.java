package inheritance;

public class Emloyee extends Department {
	int emp_id=111;
	String emp_city="pune";
	public void emp_info() {
	System.out.println("Inside child class Employee:");
	System.out.println("Dept_id: "+dept_id);
	System.out.println("Dept location: "+dept_location);
	System.out.println("employee id: "+emp_id);
	System.out.println("employee city: "+emp_city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emloyee e=new Emloyee();
		e.emp_info();
		e.dept_info();

	}

}
