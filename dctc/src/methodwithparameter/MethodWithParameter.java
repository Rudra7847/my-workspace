package methodwithparameter;

public class MethodWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodWithParameter s=new  MethodWithParameter();
		 s.add_one_parameter(20);
		 s.sub_two_parameter(60, 40);
		 s.avg_three_parameter(20.34f, 23.89f, 34.97f);
		 s.per_four_parameter(40f, 50f, 30f, 40f);

	}
	public void add_one_parameter(int a) {
	a+=a;
	System.out.println("value of a :"+a);
	}
	public void sub_two_parameter(int a,int b) {
		int c=a-b;
		System.out.println("substraction :"+c);
		
	}
	public void avg_three_parameter(float a,float b,float c) {
		float avg=a+b+c/3;
				System.out.println("avg of numbers:"+avg);
	}
	public void per_four_parameter(float a,float b,float c,float d) {
		float percentage=(a+b+c+d)/400*100;
		System.out.println("percentage= :"+percentage);
	}

}
