package assignment;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40,b=100,c=40;
		if(a>b&&a>c) {
			System.out.println("largest number is: "+a);
		}
		else if(b>a&&b>c) {
			System.out.println("largest number is :"+b);
		
		}
		else if(c>a&&c>b) {
			System.out.println("largest number is :"+c);
		}
		else if(b==c&&a>b) {
			System.out.println("largest number is :"+a);
		}
		else if(a==c&&b>a) {
			System.out.println("largest number is :"+b);
		}
		else if(a==b&&c>b) {
			System.out.println("largest number is :"+c);
		}
		else{
			System.out.println("largest number is :"+a);
		}

	}

}
