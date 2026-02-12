package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int vote = 19;
		if(vote > 18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
		 throw new ArithmeticException("not eligible to vote");
		}
		// TODO Auto-generated method stub

	}

}
