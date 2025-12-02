package exceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3;
		int b=0;
		try
		{
		int c=a/b;
		}
		catch(ArithmeticException e)
		{
			b= 1;
			int d=a/b;
			System.out.println(d);
			System.out.println(e);
			
		}
		finally
		{
			/*b= 3;
			int d=a/b;
			System.out.println(d);*/
			System.out.println("mandatory elements");
		}
	}

}
