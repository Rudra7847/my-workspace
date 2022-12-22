package inheritance;

public class Salary extends Emloyee {
	int emp_salary=100000;
	public void salary_details() {
		System.out.println("Department id:"+dept_id);
		System.out.println("Department location:"+dept_location);
		System.out.println("emloyee id:"+emp_id);
		System.out.println("employee city:"+emp_city);
		System.out.println("employee salary:"+emp_salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary x=new Salary();
		System.out.println("Inside child class salary");
		x.salary_details();
		

	}

}
