package exceptionHandling;

public class CustomException2 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
int age =17;
if(age>18)
{
	
	System.out.println("eligible for voting");
}
else
{
	
	throw new AgeException("age undrer 18!!!");
}
	}

}
