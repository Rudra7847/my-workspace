
public class BitwiseOpertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=12;
        int b=14;
        int c=a&b;  //both are 1 then 1 otherwise 0;
        System.out.println("AND OPERTION: "+c);
        c=a|b;  // both are 0 then output 0 otherwise 1;
        System.out.println("OR OPERATION: "+c);
        c=a^b;  // if inputs are different then output is 1 otherwise 0;
        System.out.println("XOR OPERATION: "+c);
	}

}
