package decisionmaking;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age=20;
        int weight=50;
        if(age>18) {
        	if(weight>50) {
        	System.out.println("you are eligible to blood donation");
        	}
        	else {
        		System.out.println("you are not eligible to blood donation:");
        		System.out.println("you are weight less than 50:"+" weight:"+weight+" age:"+age);
        	}
        	
        		
        	}
        
        else {
        	System.out.println("you are not eligible to blood donation:");
    		System.out.println("you are age less than 18:"+" weight:"+weight+" age:"+age);
        }
        }
	}


