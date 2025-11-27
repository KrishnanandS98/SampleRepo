package polymorphism;

public class PolyChild extends PolyParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChild obj = new PolyChild();
		obj.math(5, 6);
		
	}
public void math(int a,int b) {
	
	int c=a-b;
	System.out.println("a-b = "+c);
	super.math(5, 7);
}
}
