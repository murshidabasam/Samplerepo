package exceptionhandling;

public class Example {

	public static void main(String[] args) {
		int a=10;
		int b= 0;
		try
		{
			int c = a/b;
		}
		catch(ArithmeticException z)
		{
			b=2;
			int c =a/b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(z);
			
		}
		finally
		{
			System.out.println("mandatory handling");
		}
		
		// TODO Auto-generated method stub

	}

}
