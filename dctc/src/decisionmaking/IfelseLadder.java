package decisionmaking;

public class IfelseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-40;
		if(a>75) {
			System.out.println("pass with distnction");
		}
		else if(a>60) {
			System.out.println("pass with first class");
			
		}
		else if(a>50) {
			System.out.println("pass with second class");
		}
		else if(a>40) {
			System.out.println("pass with third class");
		}
		else if(a<40) {
			System.out.println("fail");
		}
		else {
			System.out.println("not found");
		}

	}

}
