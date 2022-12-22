package stringdemo;

public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Sonali");
		System.out.println(s);
		s.append("Vinayak");
		System.out.println(s);
		s.insert(6,"-");
		System.out.println(s);
		s.insert(6,"object");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.length());

	}

}
