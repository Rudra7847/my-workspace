package staticandnonstatic;

public class StaticAndNonStatic {
	int empid;        //non static variable
	static int empsal;   //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticAndNonStatic s=new StaticAndNonStatic();
s.get();
put();
s.update();
patch();
	}
	public void get()
	{
		empid=1;
		empsal=8000;
		System.out.println("IN GET FUNCTION");
		System.out.println("EMPLOYEE ID: "+empid);
		System.out.println("EMPLOYEE SALARY: "+empsal);
	}
	public static void put()
	
	{
	empsal=9000;
	System.out.println("IN PUT FUNCTION");
	System.out.println("EMPLOYEE SALARY: "+empsal);
	}
	public void update()
	{
		empid=2;
		empsal=9000;
		System.out.println("IN UPDATE FUNCTION");
		System.out.println("EMPLOYEE ID: "+empid);
		System.out.println("EMPLOYEE SALARY: "+empsal);
		
	}
	public static void patch()
	{
		StaticAndNonStatic v=new StaticAndNonStatic();
		v.empid=3;
		empsal=10000;
		System.out.println("IN PATCH FUNCTION");
		System.out.println("EMPLOYEE ID: "+v.empid);
		System.out.println("EMPLOYEE SALARY: "+empsal);
	}

}
