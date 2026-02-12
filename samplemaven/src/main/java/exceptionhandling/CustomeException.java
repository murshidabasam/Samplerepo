package exceptionhandling;

public class CustomeException {

	public static void main(String[] args) throws VotingException, AgeException {
		// TODO Auto-generated method stub
		int vote = 1;
		if(vote > 18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
		 throw new AgeException("not eligible to vote");
		}

	}

}
