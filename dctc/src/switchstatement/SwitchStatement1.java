package switchstatement;

public class SwitchStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch1=4;
		int ch2=2;
		switch(ch1) {
		case 1:
			System.out.println("press 1 for english");
			
			switch(ch2) 
			{
			    case 1:
				   System.out.println("press 1 for prepaid");
				break;
			case 2:
				System.out.println("press 2 for postpaid");
				break;
			}
			break;
			
		case 2:
			System.out.println("press 1 for hindi");
			
			switch(ch2) {
			case 1:
				System.out.println("press 1 for prepaid");
				break;
			case 2:
				System.out.println("press 2 for postpaid");
				break;
				
			
		}
			break;
			
		case 3:
			System.out.println("press 1 for marathi");
		
			switch(ch2) {
			case 1:
				System.out.println("press 1 for prepaid");
				break;
			case 2:
				System.out.println("press 2 for postpaid");
				break;
		
			

	}
			break;
			default:
				
				System.out.println("go to main menu");
					

}
		}

}