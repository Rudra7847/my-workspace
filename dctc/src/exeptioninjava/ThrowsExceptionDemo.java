package exeptioninjava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThrowsExceptionDemo t1=new 	ThrowsExceptionDemo();
		t1.test();
		t1.file_read();

	}
	public void test() throws Exception {
	int a=56,b=0,x=0;
	x=a*b;
	System.out.println("multiplication of a and b:"+x);
	x=a/b;
	System.out.println("division of a and b:"+x);
	x=a+b;
	System.out.println("addition of a and b:"+x);
	x=a-b;
	System.out.println("substraction of a and b:"+x);
	}
	public void file_read() throws FileNotFoundException
	{
		FileInputStream fin=new FileInputStream("a.txt");
	}

}
