package switchstatement;
import 	methodwithparameter.MethodWithParameter;

public class SwitchStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithParameter v=new 	MethodWithParameter() ;
		int ch=2;
		switch(ch) {
		case 1:
			System.out.println("in case number 1");
			v.avg_three_parameter(5.7f, 6.9f, 4.8f);
			break;
		case 2:
			System.out.println("in case number 2");
			v.add_one_parameter(90);
			break;
		default:
			System.out.println("no operation");
		}

	}

}
