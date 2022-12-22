package enumdatatype;

public class EnumDemo {
	enum month {jan,feb,march,april,may,jun,july};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch(month.april) {
		case jan:
			System.out.println("january");
			break;
		case feb:
			System.out.println("february");
			break;
		case march:
			System.out.println("march");
			break;
		case april:
			System.out.println("april");
			break;
		case may:
			System.out.println("may");
			break;
		 default:
			System.out.println("wrong choice");
			break;
			
		
		
		}
		

	}

}
