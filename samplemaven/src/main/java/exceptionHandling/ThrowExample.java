package exceptionHandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =17;
		if(age>18)
		{
			
			System.out.println("eligible for voting");
		}
		else
		{
			
			throw new ArithmeticException("age undrer 18!!!");
		}

	}

}
