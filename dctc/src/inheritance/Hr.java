package inheritance;

public class Hr extends Emloyee {
	int emp_pf_number=12345678;
	public void pf_details() {
		System.out.println("Department id:"+dept_id);
		System.out.println("Department location:"+dept_location);
		System.out.println("emloyee id:"+emp_id);
		System.out.println("employee city:"+emp_city);
		System.out.println("employee pf number:"+emp_pf_number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hr v=new Hr();
		System.out.println("Inside child class Hr");
		v.pf_details();
		

	}

}
