package exeptioninjava;

public class ExceptionDemo4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int n=-5;
		if(n<0)
		{
			try
		{
				throw new Exception ("Its Negative Number");
		}
		catch(NegativeNumberExeption e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
			
		}
		else
		{
			System.out.println("Greter than 0");
		}
		

	}

}
