package exceptionHandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub

		
		int age =17;
		if(age>18)
		{
			
			System.out.println("eligible for voting");
		}
		else
		{
			
			throw new VotingException("age undrer 18!!!");
		}
	}

}
